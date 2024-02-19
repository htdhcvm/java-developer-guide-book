package org.example.businessrulesengine;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {

    private final List<Action> actions;

    private final Facts facts;

    public BusinessRuleEngine(Facts facts) {
        this.facts = facts;
        this.actions = new ArrayList<>();
    }

    public void addAction(
            Action action
    ) {
        actions.add(action);
    }

    public int count() {
        return actions.size();
    }

    public void run() {
        actions.forEach(action -> action.execute(facts));
    }
}
