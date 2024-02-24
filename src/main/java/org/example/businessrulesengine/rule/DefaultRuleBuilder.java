package org.example.businessrulesengine.rule;

import org.example.businessrulesengine.Action;
import org.example.businessrulesengine.Condition;

public class DefaultRuleBuilder {
    private final Condition condition;
    public DefaultRuleBuilder(Condition condition) {
        this.condition = condition;
    }

    public static DefaultRuleBuilder when(Condition condition) {
        return new DefaultRuleBuilder(condition);
    }

    public DefaultRule then(Action action) {
        return new DefaultRule(condition, action);
    }
}
