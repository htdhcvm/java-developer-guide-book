package org.example.businessrulesengine;

import java.util.HashMap;
import java.util.Map;

public class Facts {
    private final Map<String, String> facts = new HashMap<>();

    public String getFact(final String name) {
        return facts.get(name);
    }

    @Override
    public String toString() {
        return "Facts{" +
                "facts=" + facts +
                '}';
    }

    public void addFact(
            final String name,
            final String value
    ) {
        facts.put(name, value);
    }


}
