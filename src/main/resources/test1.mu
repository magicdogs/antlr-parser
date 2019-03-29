
    var a = blacklist_rules(data);
    if (blacklist_rules(data) != '1') {
        return blacklist_rules(data);
    } else if (access_rules(data) != '1') {
        return access_rules(data);
    } else if (access_rule_2(data) != '1') {
        return access_rule_2(data);
    } else if (data["riskRuleScore"] < 496) {
        return '命中风险评分规则';
    } else if (credit_limit(data) > 0) {
        return '机审通过，请放款';
    } else {
        return '额度为0';
    }




if(poly_letter_real_name_authentication(data)=='1'){
     if(after_rejection_orders(data)=='1'){
       if(interchange_phone_rules(data)=='1'){
         if(average_monthly_fee_rules(data)=='1'){
           if(emergency_contact_call_rules(data)=='1'){
            if(access_same_shield(data)=='1'){
                  return new_and_old_user_rules(data);}
                else{
                   return access_same_shield(data);}
                }else{
                       return emergency_contact_call_rules(data);}
              }else{
                    return average_monthly_fee_rules(data);}
            }else{
                  return interchange_phone_rules(data);}
          }else{
                return after_rejection_orders(data);}
        }else{
              return poly_letter_real_name_authentication(data);}




if(data["jxlLink2Num"]<0){
  return '聚信立第二联系人通话次数不足';
}else{
  return '1';
}





if (poly_letter_real_name_authentication(data) == '1') {
    if (after_rejection_orders(data) == '1') {
        if (interchange_phone_rules(data) == '1') {
            if (average_monthly_fee_rules(data) == '1') {
                if (emergency_contact_call_rules(data) == '1') {
                    if (access_same_shield(data) == '1') {
                        return new_and_old_user_rules(data);
                    } else if (sss(data) == '1'){
                        return "aaax";
                    }else {
                        return access_same_shield(data);
                    }
                } else {
                    return emergency_contact_call_rules(data);
                }
            } else {
                return average_monthly_fee_rules(data);
            }
        } else {
            return interchange_phone_rules(data);
        }
    } else {
        return after_rejection_orders(data);
    }
} else {
    return poly_letter_real_name_authentication(data);
}


 if (collection_suggestion_rules(data) == '1') {
        if (background_overdue_days_rule(data) == '1') {
            if (background_overdue_records(data) == '1') {
                return cx(data);
            } else {
                return collection_suggestion_rules(data);
            }
        } else {
            return background_overdue_days_rule(data);
        }
    } else {
        return background_overdue_records(data);
    }
