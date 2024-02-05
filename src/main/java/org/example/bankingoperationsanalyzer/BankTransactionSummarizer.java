package org.example.bankingoperationsanalyzer;

@FunctionalInterface
public interface BankTransactionSummarizer {
    double summarize(
            double accumulator,
            BankTransaction bankTransaction
    );
}
