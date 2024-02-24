package org.example.businessrulesengine;

@FunctionalInterface
public interface Rule {
    void perform(Facts facts);
}
