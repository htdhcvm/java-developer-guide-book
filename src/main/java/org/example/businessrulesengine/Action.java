package org.example.businessrulesengine;

@FunctionalInterface
public interface Action {
    void execute(Facts facts);
}

