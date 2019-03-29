package com.magicdogs.antlr.visitor;

import com.magicdogs.antlr.parser.FuncBaseVisitor;
import com.magicdogs.antlr.parser.FuncParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.*;

/**
 * @author magic
 * @version 1.0.0
 * Description ExtendFuncBaseVisitor
 * @date 2019/3/28/028 12:34
 */
public class ExtendFuncBaseVisitor extends FuncBaseVisitor<String> {

    private Stack<FuncParser.If_statContext> stat_blockContexts = new Stack<>();
    private int INDEX = 1;
    private String RET = "result";


    @Override
    public String visitStat_block(FuncParser.Stat_blockContext ctx) {
        if(Objects.nonNull(ctx.RET())){
            modifyRetStatement(ctx.RET(),ctx.RET().getText() + " ");
        }
        return super.visitStat_block(ctx);
    }

    /**
     * 将所有的 return 语句 后面加一个空格，分割关键字
     * @param ret TerminalNode
     */
    private void modifyRetStatement(TerminalNode ret,String text) {
        if(ret.getSymbol() instanceof CommonToken){
            CommonToken token = (CommonToken) ret.getSymbol();
            token.setText(text);
        }
    }

    /**
     * 保存 条件代码段的 引用
     * @param ctx if 代码段
     * @return 无
     */
    @Override
    public String visitIf_stat(FuncParser.If_statContext ctx) {
        if(Objects.nonNull(ctx.condition_block())){
            stat_blockContexts.push(ctx);
        }
        if(Objects.nonNull(ctx.ELSE())){
            ctx.ELSE().forEach(el->{
                modifyRetStatement(el," " + el.getText() + " ");
            });
        }
        String result = super.visitIf_stat(ctx);
        return result;
    }

    /**
     * 进行树的修复
     * @param ctx ContentContext
     * @return 无
     */
    @Override
    public String visitContent(FuncParser.ContentContext ctx) {
        String result = super.visitContent(ctx);
        Map<String, FuncParser.Condition_blockContext> conditionMap = new HashMap<>(32);
        Map<String, FuncParser.Stat_blockContext> statBlockMap = new HashMap<>(32);
        while (!stat_blockContexts.isEmpty()){
            FuncParser.If_statContext if_statContext = stat_blockContexts.pop();
            if(Objects.nonNull(if_statContext)){
                fixConditionTreeConstruct(if_statContext,conditionMap,statBlockMap);
            }
        }
        conditionMap.forEach((condKey,condVal)->{
            statBlockMap.forEach((statKey,statVal)->{
                if(condKey.equals(statKey)){
                    System.out.println(statKey + ", " + condVal.depth() + " , " + statVal.depth());
                    if(condVal.depth() <= statVal.depth()){
                        fixDepthLevelLikeNodes(condVal, statKey, statVal);
                    }else{
                        fixDepthLevelOffsetDistance(condVal,statKey,statVal,conditionMap);
                    }
                }
            });
        });
        System.out.println(ctx.getText());
        return result;
    }

    /**
     * 如果 条件代码块中出现的内容不再 当前 代码块中 ， 查找最近的一个父节点进行修复
     * @param condVal 表达式
     * @param statKey 表达式的值
     * @param statVal 代码块引用
     * @param conditionMap 条件map集合
     */
    private void fixDepthLevelOffsetDistance(FuncParser.Condition_blockContext condVal, String statKey, FuncParser.Stat_blockContext statVal, Map<String, FuncParser.Condition_blockContext> conditionMap) {
        FuncParser.Condition_blockContext searchResult = searchDepthNearlyLevelCondition(conditionMap,statVal);
        if(Objects.nonNull(searchResult)){
            String var = RET + INDEX++;
            TerminalNode varNode = createVarTerminalNode(var,statKey);
            TerminalNode varName = createTerminalNode(var);
            TerminalNode quoteToken = createTerminalNode(";");
            if(condVal.expr() instanceof FuncParser.ExprEQNEQContext) {
                FuncParser.ExprEQNEQContext eqneqContext = (FuncParser.ExprEQNEQContext) condVal.expr();
                eqneqContext.children.add(2,varName);
                eqneqContext.children.remove(0);
                eqneqContext.children.remove(0);

                statVal.children.add(2,quoteToken);
                statVal.children.add(2,varName);
                statVal.children.remove(4);

                ParserRuleContext parserRuleContext = searchResult.getParent();
                parserRuleContext.children.add(0,varNode);
            }

        }
    }

    /**
     * 搜索一个最相匹配的表达式，进行变量执行和申明提前到if 的外面
     * @param conditionMap 条件表达式的集合
     * @param condVal 匹配的condition
     * @return 搜索的结果
     */
    private FuncParser.Condition_blockContext searchDepthNearlyLevelCondition(Map<String, FuncParser.Condition_blockContext> conditionMap, FuncParser.Stat_blockContext condVal) {
        TreeSet<FuncParser.Condition_blockContext> orderSets = new TreeSet<FuncParser.Condition_blockContext>((o1, o2)->{ return o2.depth() - o1.depth();});
        conditionMap.forEach((key,val) -> orderSets.add(val));
        int depth = condVal.depth();
        List<FuncParser.Condition_blockContext> result = new ArrayList<>(32);
        orderSets.forEach(val->{
            if(val.depth()<= depth){
                result.add(val);
            }
        });
        if(result.isEmpty()){
            return null;
        }
        return result.get(0);
    }

    /**
     * 相同级别的树深节点修正 优化
     * @param condVal 条件表达式
     * @param statKey 表达式的值
     * @param statVal 代码块
     */
    private void fixDepthLevelLikeNodes(FuncParser.Condition_blockContext condVal, String statKey, FuncParser.Stat_blockContext statVal) {
        String var = RET + INDEX++;
        TerminalNode varNode = createVarTerminalNode(var,statKey);
        TerminalNode varName = createTerminalNode(var);
        TerminalNode quoteToken = createTerminalNode(";");
        if(condVal.expr() instanceof FuncParser.ExprEQNEQContext) {
            FuncParser.ExprEQNEQContext eqneqContext = (FuncParser.ExprEQNEQContext) condVal.expr();
            eqneqContext.children.add(0,varName);
            eqneqContext.children.remove(2);
            eqneqContext.children.remove(1);
        }
        ParserRuleContext parserRuleContext = (ParserRuleContext) condVal.parent;
        parserRuleContext.children.add(0,varNode);
        statVal.children.add(2,quoteToken);
        statVal.children.add(2,varName);
        statVal.children.remove(4);
    }

    /**
     * 声明变量
     * @param var 变量名称
     * @param assignment 变量的值
     * @return 返回节点信息
     */
    private TerminalNode createVarTerminalNode(String var,String assignment) {
        StringBuilder builder = new StringBuilder();
        builder.append("var ").append(var).append(" = ").append(assignment).append(";");
        return createTerminalNode(builder.toString());
    }

    /**
     * 创建 文本 节点
     * @param text 文本内容
     * @return 节点
     */
    private TerminalNode createTerminalNode(String text) {
        Token token = new CommonToken(0,text);
        return new TerminalNodeImpl(token);
    }

    /**
     * 修复树的层级关系
     * @param if_statContext if 段
     * @param conditionMap 条件 map 集合
     * @param statBlockMap 代码块集合
     */
    private void fixConditionTreeConstruct(FuncParser.If_statContext if_statContext,
                                           Map<String, FuncParser.Condition_blockContext> conditionMap,
                                           Map<String, FuncParser.Stat_blockContext> statBlockMap) {
        if(Objects.nonNull(if_statContext.condition_block())){
            if_statContext.condition_block().forEach(condition ->{
                FuncParser.ExprContext exprContext = condition.expr();
                FuncParser.Stat_blockContext statBlockContext = condition.stat_block();
                String ifCondition = getExprContentKey(exprContext);
                String trueCondition = getReturnKey(statBlockContext);
                String elseCondition = getReturnKey(if_statContext.stat_block());
                if(Objects.nonNull(ifCondition)){
                    conditionMap.put(ifCondition,condition);
                   if(Objects.nonNull(trueCondition)){
                       statBlockMap.put(trueCondition,statBlockContext);
                   }
                   if(Objects.nonNull(elseCondition)){
                       statBlockMap.put(elseCondition,if_statContext.stat_block());
                   }
                    //System.out.println("if condition: " + ifCondition + condition.depth() + ",true: " + trueCondition + exprContext.depth() + ",else: " + elseCondition + if_statContext.stat_block().depth());
                }
            });
        }
    }

    /**
     * 获取 return 语句后面的表达式
     * @param statBlockContext return 出现的代码段
     * @return 返回 return 后面的内容
     */
    private String getReturnKey(FuncParser.Stat_blockContext statBlockContext) {
        if(Objects.nonNull(statBlockContext) && Objects.nonNull(statBlockContext.ret()) && Objects.nonNull(statBlockContext.ret().r())){
            StringBuilder builder = new StringBuilder(statBlockContext.ret().getText());
            builder.deleteCharAt(builder.length() - 1);
            return builder.toString();
        }
        return null;
    }

    private String getExprContentKey(FuncParser.ExprContext exprContext) {
        if(exprContext instanceof FuncParser.ExprEQNEQContext){
            FuncParser.ExprEQNEQContext eqneqContext = (FuncParser.ExprEQNEQContext) exprContext;
            if(Objects.nonNull(eqneqContext) && Objects.nonNull(eqneqContext.ID())
                    && Objects.nonNull(eqneqContext.key())){
                return getConditionLeft(eqneqContext);
            }
        }
        return null;
    }

    /**
     * 获取条件表达式左侧的名称
     * @param eqneqContext 表达式模式
     * @return 值
     */
    private String getConditionLeft(FuncParser.ExprEQNEQContext eqneqContext) {
        StringBuilder builder = new StringBuilder();
        builder.append(eqneqContext.ID().getText());
        builder.append(eqneqContext.key().getText());
        return builder.toString();
    }
}
