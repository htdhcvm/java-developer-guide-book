package org.example.bankingoperationsanalyzer.parser;


import org.example.bankingoperationsanalyzer.BankTransaction;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFrom(String line);

    List<BankTransaction> parseLinesFrom(List<String> lines);
}
