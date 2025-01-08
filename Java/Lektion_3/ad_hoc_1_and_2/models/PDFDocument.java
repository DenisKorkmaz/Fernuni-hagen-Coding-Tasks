package Java.Lektion_3.ad_hoc_1_and_2.models;
import Java.Lektion_3.ad_hoc_1_and_2.interfaces.Printable;

public class PDFDocument implements Printable {

    private boolean print;

    public PDFDocument(boolean print){
        this.print = print;
    }

    @Override
    public boolean print() {
        return print;
    }
    
}
