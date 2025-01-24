package Java.Lektion_4.selfTestTasks.selfTest1;

import java.util.LinkedList;

public class FigurenListe {

    private java.util.LinkedList<GeometrischeFigur> list;

    public FigurenListe() {
        list = new LinkedList<GeometrischeFigur>();
    }

    public void figurAnfuegen(GeometrischeFigur figur) {
        list.addLast(figur);
    }

    public GeometrischeFigur letzteFigurAuslesen() {
        return list.getLast();
    }

    public void alleAnzeigen() {
        for (GeometrischeFigur element : list) {
            element.anzeigen();
        }
    }
}
