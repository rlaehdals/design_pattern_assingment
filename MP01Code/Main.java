import cheker.EngSpellChecker;
import converter.DocxDocConverter;
import converter.OdtDocConverter;
import converter.PdfDocConverter;
import processor.WordProcessor;

public class Main {
    public static void main(String[] args){
        WordProcessor wp = new WordProcessor("new doc");
        wp.setSpellChecker(new EngSpellChecker());
        wp.addDocConverter(new DocxDocConverter("docx"));
        wp.addDocConverter(new PdfDocConverter("pdf"));
        wp.addDocConverter(new OdtDocConverter("odt"));
        wp.checkSpelling();
        wp.convertDocTo("odt");
        wp.convertDocTo("pdf");
        wp.convertDocTo("docx");
        wp.convertDocTo("wps");
    }
}
