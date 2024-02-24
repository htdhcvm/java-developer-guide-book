package org.example.documentmanagementsystem;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class DocumentManagementSystemTest {
    private static final String RESOURCES =
            "src" + File.separator + "main" + File.separator + "resources" + File.separator +
                    "documentmanagementsystem" + File.separator;

    private static final String LETTER = RESOURCES + "patient.letter";
    private static final String REPORT = RESOURCES + "patient.report";
    private static final String INVOICE = RESOURCES + "patient.invoice";

    private DocumentManagementSystem documentManagementSystem;

    @Before
    public void setUp() {
        documentManagementSystem = new DocumentManagementSystem();
    }


    @Test
    public void shouldImportFile() throws Exception {
        //        documentManagementSystem.importFile(LETTER);
        //
        //        final Document document = onlyDocument();
        //
        //        assertAttributeEquals(document, Attributes.PATH, LETTER);
    }


}
