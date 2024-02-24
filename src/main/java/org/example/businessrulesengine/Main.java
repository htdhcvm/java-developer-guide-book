package org.example.businessrulesengine;


public class Main {
    public static void main(String[] args) {
        Facts facts = new Facts();
        facts.addFact("jobTitle", "CEO");
        facts.addFact("stage", String.valueOf(Stage.LEAD));
        facts.addFact("amount", "1000");

        BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(facts);

        businessRuleEngine.addAction(fact -> {
            String jobTitle = fact.getFact("jobTitle");

            if ("CEO".equals(jobTitle)) {
                String name = fact.getFact("name");
                System.out.println("Send email ");
            }
        });


        businessRuleEngine.addAction(fact -> {
            double forecastedAmount = 0.0;

            Stage stage = Stage.valueOf(fact.getFact("stage"));
            double amount = Double.parseDouble(fact.getFact("amount"));

            if(stage == Stage.LEAD) {
                forecastedAmount = amount * 0.2;
            } else if (stage == Stage.EVALUATING) {
                forecastedAmount = amount * 0.5;
            }
            else if (stage == Stage.INTERESTED) {
                forecastedAmount = amount * 0.8;
            }
            else if (stage == Stage.CLOSED) {
                forecastedAmount = amount;
            }

            fact.addFact("forecastedAmount", String.valueOf(forecastedAmount));
        });


        businessRuleEngine.run();
        System.out.println(facts);
    }
}
