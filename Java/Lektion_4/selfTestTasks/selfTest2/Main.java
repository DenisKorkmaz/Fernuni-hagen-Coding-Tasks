package Lektion_4.selfTestTasks.selfTest2;

public class Main {
    public static void main(String[] args) {
        PDF pdf1 = new PDF("pdf 1");
        PDF pdf2 = new PDF("pdf 2");
        Tupel<PDF> pdf = new Tupel<PDF>(pdf1, pdf2);
        pdf.beideDrucken();
    }
}
