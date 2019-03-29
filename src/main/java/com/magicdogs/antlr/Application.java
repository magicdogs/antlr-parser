package com.magicdogs.antlr;

import com.magicdogs.antlr.parser.FuncLexer;
import com.magicdogs.antlr.parser.FuncParser;
import com.magicdogs.antlr.visitor.ExtendFuncBaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Application {

    public static void main(String[] args) throws Exception{
        String file = "C:\\Users\\Administrator\\Desktop\\antlr-parser\\src\\main\\resources\\test.mu";
        CharStream charStream = CharStreams.fromFileName(file);
        FuncLexer lexer = new FuncLexer(charStream);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        FuncParser parser = new FuncParser(stream);
        parser.setBuildParseTree(true);
        ExtendFuncBaseVisitor visitor = new ExtendFuncBaseVisitor();
        FuncParser.ParseContext rContext = parser.parse();
        rContext.accept(visitor);
    }

}
