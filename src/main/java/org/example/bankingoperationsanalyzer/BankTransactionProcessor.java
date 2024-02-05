package org.example.bankingoperationsanalyzer;


import org.example.bankingoperationsanalyzer.filter.BankTransactionFilter;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class BankTransactionProcessor {

    private final List<BankTransaction> bankTransactions;

    public BankTransactionProcessor(final List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }


    public double summarizeTransactions(final BankTransactionSummarizer bankTransactionSummarizer) {
        double result = 0;

        for (BankTransaction bankTransaction : bankTransactions) {
            result = bankTransactionSummarizer.summarize(0, bankTransaction);
        }

        return result;
    }

    public double calculateTotalAmount() {
        return bankTransactions.stream()
                .map(BankTransaction::getAmount)
                .reduce(0d, (acc, curr) -> acc += curr);
    }


    public double calculateTotalInMonth(final Month month) {
        return summarizeTransactions((acc, bankTransaction) -> bankTransaction.getDate()
                .getMonth() == month ? acc + bankTransaction.getAmount() : acc);
    }

    public double calculateTotalForCategory(final String category) {
        return bankTransactions.stream()
                .filter(transaction -> transaction.getDescription()
                        .equals(category))
                .map(BankTransaction::getAmount)
                .reduce(0d, (acc, curr) -> acc += curr);
    }


    public List<BankTransaction> findTransactions(final BankTransactionFilter bankTransactionFilter) {
        return bankTransactions.stream()
                .filter(bankTransactionFilter::test)
                .collect(Collectors.toList());
    }

    public List<BankTransaction> findTransactionsGreaterThanEqual(final int amount) {
        return findTransactions(bankTransaction -> bankTransaction.getAmount() >= amount);
    }
}
