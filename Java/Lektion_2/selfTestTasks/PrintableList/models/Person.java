package Java.Lektion_2.selfTestTasks.PrintableList.models;

import Java.Lektion_2.selfTestTasks.PrintableList.interfaces.Printable;

public class Person implements Printable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return name;
    }
}
