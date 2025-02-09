package Lektion_3.ad_hoc_1_and_2.models;

import Lektion_3.ad_hoc_1_and_2.interfaces.Printable;

public class PDFDocument implements Printable {

    private final boolean print;

    public PDFDocument(boolean print) {
        this.print = print;
    }

    @Override
    public boolean print() {
        return print;
    }

}
