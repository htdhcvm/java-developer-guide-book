package org.example.documentmanagmentsystem;

import org.example.documentmanagmentsystem.importers.Importer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DocumentManagementSystem {

    private Map<String, Importer> importers = new HashMap<>();

    public DocumentManagementSystem() {
//        extensionToImporter.put("report", new ReportImporter());
//        extensionToImporter.put("jpg", new ImageImporter());
    }

    public void importFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) throw new FileNotFoundException("File not found " + path);

        final String extension = getExtension(path);


    }

    private String getExtension(String path) throws IOException {
        final int findPoint = path.lastIndexOf(".");

        if (findPoint == -1) {
            throw new IOException("No extension found For file: " + path);
        }

        if (findPoint == path.length()) {
            throw new IOException("No extension found For file: " + path);
        }

        return path.substring(separatorIndex + 1);
    }
}
