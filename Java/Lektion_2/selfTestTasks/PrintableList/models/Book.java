package Java.Lektion_2.selfTestTasks.PrintableList.models;
import Java.Lektion_2.selfTestTasks.PrintableList.interfaces.Printable;

public class Book implements Printable {
    
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String print() {
        return title;
    }
}

