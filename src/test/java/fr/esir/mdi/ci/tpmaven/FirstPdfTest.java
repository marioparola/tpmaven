package fr.esir.mdi.ci.tpmaven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.itextpdf.text.Document;

/**
 * ecriture d'un test junit simple pour tester la couverture des test
 */
public class FirstPdfTest {
	
	
	@Test
    public void test()
    {
		/** Document document = new Document();
		document.addTitle("My first PDF");
	    document.addSubject("Using iText");
	    document.addKeywords("Java, PDF, iText");
	    document.addAuthor("Olivier Barais");
	    document.addCreator("Olivier Barais");
	    Document document2 = new Document();
	    FirstPdf.addMetaData(document2);
        assertTrue(document.equals(document2) );*/
		assertTrue(FirstPdf.trueMethod() );
       
    }
}
