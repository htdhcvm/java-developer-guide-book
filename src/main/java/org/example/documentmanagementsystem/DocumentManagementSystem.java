package org.example.documentmanagementsystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DocumentManagementSystem {
    private final Map<String, Importer> extensionToImporter = new HashMap<>();

    void importFile(String path) {
        extensionToImporter.put("letter", new ImageImporter());
    }

    List<Document> contents() {
        return List.of(new Document(new TreeMap<>()));
    }
}
