package org.example;

import org.example.bankingoperationsanalyzer.BankStatementAnalyzer;
import org.example.bankingoperationsanalyzer.parser.BankStatementCSVParser;
import org.example.bankingoperationsanalyzer.parser.BankStatementParser;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
        final BankStatementParser bankStatementParser = new BankStatementCSVParser();
        final String path = args[0];

        bankStatementAnalyzer.analyze(path, bankStatementParser);
    }
}
