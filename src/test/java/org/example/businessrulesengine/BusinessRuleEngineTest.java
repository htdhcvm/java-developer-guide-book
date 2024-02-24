package org.example.businessrulesengine;

import org.junit.Test;

import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

public class BusinessRuleEngineTest {
    @Test
    public void shouldHaveNoRulesInstall() {
//        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

//        assertEquals(0, businessRuleEngine.count());
    }

    @Test
    public void shouldAddTwoActions() {
        final Facts mockFacts = mock(Facts.class);
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);


        businessRuleEngine.addAction((facts) -> {
        });
        businessRuleEngine.addAction((facts) -> {
        });

        assertEquals(2, businessRuleEngine.count());
    }

    @Test
    public void shouldExecuteOneAction() {
        final Action actionMock = mock(Action.class);
        final Facts facts = mock(Facts.class);
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(facts);

        businessRuleEngine.addAction(actionMock);
        businessRuleEngine.run();

        verify(actionMock).perform(facts);
    }

    @Test
    public void shouldPerformAnActionWithFacts() {
        final Action action = mock(Action.class);
        final Facts facts = mock(Facts.class);

        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(facts);

        businessRuleEngine.addAction(action);
        businessRuleEngine.run();

        verify(action).perform(facts);
    }

    @Test
    public void test1 () {
        final Facts mockFacts = mock(Facts.class);

        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);

        businessRuleEngine.addAction(facts -> {

        });
    }
}
