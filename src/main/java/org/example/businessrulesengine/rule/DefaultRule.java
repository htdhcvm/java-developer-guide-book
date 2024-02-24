package org.example.businessrulesengine.rule;


import org.example.businessrulesengine.*;

public class DefaultRule implements Rule {
    private final Condition condition;

    private final Action action;

    public DefaultRule(Condition condition, Action action) {
        this.condition = condition;
        this.action = action;
    }

    @Override
    public void perform(Facts facts) {
        if (condition.evaluate(facts)) {
            action.perform(facts);
        }
    }


    public static void main(String[] args) {
        final Condition condition = facts -> "CEO".equals(facts.getFact("jobTitle"));

        final Action action = facts -> {
            String name = facts.getFact("name");
            System.out.println("Send mail");
        };

        final Rule rule = new DefaultRule(condition, action);

        final Rule rule2 = DefaultRuleBuilder.when(condition).then(action);
    }
}
