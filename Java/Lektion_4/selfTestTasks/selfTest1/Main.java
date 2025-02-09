package Lektion_4.selfTestTasks.selfTest1;

public class Main {
    public static void main(String[] args) {
        FigurenListe liste = new FigurenListe();
        Kreise kreis = new Kreise();
        Rechtecke rechteck = new Rechtecke();

        liste.figurAnfuegen(kreis);
        liste.figurAnfuegen(rechteck);

        liste.letzteFigurAuslesen();

    }
}
