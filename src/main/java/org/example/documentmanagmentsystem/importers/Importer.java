package org.example.documentmanagmentsystem.importers;

import org.example.documentmanagmentsystem.Document;

import java.io.File;
import java.io.IOException;

public interface Importer {
    Document importFile(File file) throws IOException;
}
