package org.example.bankingoperationsanalyzer.exporter;

import org.example.bankingoperationsanalyzer.SummaryStatistics;

public interface Exporter {
    String export(SummaryStatistics summaryStatistics);
}
