package org.example.businessrulesengine;

public interface ConditionalAction {
    boolean evaluate(Facts facts);
    void perform(Facts facts);
}
