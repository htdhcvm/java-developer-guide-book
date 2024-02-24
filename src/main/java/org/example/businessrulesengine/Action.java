package org.example.businessrulesengine;


@FunctionalInterface
public interface Action {
    void perform(Facts facts);
}

