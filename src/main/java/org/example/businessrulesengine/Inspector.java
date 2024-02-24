package org.example.businessrulesengine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inspector {

    private final List<ConditionalAction> conditionalActionList;

    public Inspector(ConditionalAction ...conditionalActionList) {
        this.conditionalActionList = Arrays.asList(conditionalActionList);
    }


    public List<Report> inspect(Facts facts) {
        final List<Report> reportList = new ArrayList<>();

        for (ConditionalAction conditionalAction : conditionalActionList) {

            final boolean result = conditionalAction.evaluate(facts);
            reportList.add(new Report(conditionalAction, facts, result));
        }

        return reportList;
    }


}
