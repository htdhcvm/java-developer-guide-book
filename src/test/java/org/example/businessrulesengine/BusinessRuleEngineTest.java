package org.example.businessrulesengine;

import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

public class BusinessRuleEngineTest {
    @Test
    public void shouldHaveNoRulesInstall() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        assertEquals(0, businessRuleEngine.count());
    }

    @Test
    public void shouldAddTwoActions() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        businessRuleEngine.addAction(() -> {});
        businessRuleEngine.addAction(() -> {});

        assertEquals(2, businessRuleEngine.count());
    }

    @Test
    public void shouldExecuteOneAction() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
        final Action actionMock = mock(Action.class);

        businessRuleEngine.addAction(actionMock);
        businessRuleEngine.run();

        verify(actionMock).execute();
    }

    @Test
    public void shouldPerformAnActionWithFacts() {
        final Action action = mock(Action.class);
        final Facts facts = mock(Facts.class);

        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(facts);

        businessRuleEngine.addAction(action);
        businessRuleEngine.run();

        verify(action).execute(facts);
    }
}
