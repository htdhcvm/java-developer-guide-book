package org.example.bankingoperationsanalyzer;


import org.example.bankingoperationsanalyzer.parser.BankStatementParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankStatementAnalyzer {
    private static final String RESOURCES = "src/main/resources/bankingoperationsanalyzer";

    private static void collectSummary(
            final BankTransactionProcessor bankTransactionProcessor
    ) {
        System.out.println("The total for all transactions is " + bankTransactionProcessor.calculateTotalAmount());
        System.out.println("The total for transactions in January is " + bankTransactionProcessor.calculateTotalInMonth(
                Month.JANUARY));
        System.out.println("The total for transactions in February is " + bankTransactionProcessor.calculateTotalInMonth(
                Month.FEBRUARY));
        System.out.println("The total salary received is " + bankTransactionProcessor.calculateTotalForCategory("Salary"
        ));
        System.out.println("The expensive transactions in february " + bankTransactionProcessor.findTransactions(
                bankTransaction -> bankTransaction.getDate()
                        .getMonth() == Month.FEBRUARY && bankTransaction.getAmount() >= 1000));

    }

    public void analyze(
            final String fileName,
            final BankStatementParser bankStatementParser
    ) throws IOException {
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);
        final BankTransactionProcessor bankTransactionProcessor = new BankTransactionProcessor(bankTransactions);

        collectSummary(bankTransactionProcessor);
    }
}
