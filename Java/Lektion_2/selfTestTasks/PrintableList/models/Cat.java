package Java.Lektion_2.selfTestTasks.PrintableList.models;
import Java.Lektion_2.selfTestTasks.PrintableList.interfaces.Printable;


public class Cat implements Printable {

    private String miau = "Miau";

    @Override
    public String print() {
        return miau;
    }
}
