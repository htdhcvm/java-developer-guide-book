package org.example.bankingoperationsanalyzer.filter;


import org.example.bankingoperationsanalyzer.BankTransaction;

import java.time.Month;

public class BankTransactionIsInFebruaryAndExpensive implements BankTransactionFilter {
    @Override
    public boolean test(BankTransaction bankTransaction) {
        return bankTransaction.getDate()
                .getMonth() == Month.FEBRUARY && bankTransaction.getAmount() >= 1000;
    }
}
