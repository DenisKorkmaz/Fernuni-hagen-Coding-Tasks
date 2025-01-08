package Java.Lektion_3.ad_hoc_1_and_2;

import Java.Lektion_3.ad_hoc_1_and_2.models.Dog;
import Java.Lektion_3.ad_hoc_1_and_2.models.Letter;
import Java.Lektion_3.ad_hoc_1_and_2.models.PDFDocument;
import Java.Lektion_3.ad_hoc_1_and_2.models.Parcel;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(34.34);
        Letter letter = new Letter(5.44, true);
        Parcel parcel = new Parcel(5.44, true);
        PDFDocument pdf = new PDFDocument(true);

        System.out.println("Dog: " + "weight: " + dog.weigh() + "kg"); 
        System.out.println("Letter: " + "weight: " + letter.weigh() + "kg" + " send:" + letter.sendItem());
        System.out.println("Parcel: " + "weight: " + parcel.weigh() + "kg" + " send:" + parcel.sendItem());
        System.out.println("PDF: " + " print: " + pdf.print());


    }
}
