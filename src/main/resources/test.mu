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
