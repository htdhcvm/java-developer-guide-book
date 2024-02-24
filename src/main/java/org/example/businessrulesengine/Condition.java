package org.example.businessrulesengine;

@FunctionalInterface
public interface Condition {
    boolean evaluate(Facts facts);
}
