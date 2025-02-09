package Lektion_2.selfTestTasks.PrintableList.models;

import Lektion_2.selfTestTasks.PrintableList.interfaces.Printable;


public class Cat implements Printable {

    private String miau = "Miau";

    @Override
    public String print() {
        return miau;
    }
}
