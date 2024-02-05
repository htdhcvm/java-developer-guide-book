package org.example.bankingoperationsanalyzer.filter;


import org.example.bankingoperationsanalyzer.BankTransaction;

@FunctionalInterface
public interface BankTransactionFilter {
    boolean test(BankTransaction bankTransaction);
}
