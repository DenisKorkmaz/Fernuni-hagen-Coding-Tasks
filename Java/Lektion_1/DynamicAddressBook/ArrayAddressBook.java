package Lektion_1.DynamicAddressBook;

import java.util.Arrays;

public class ArrayAddressBook {

    private Person[] persons;
    private int newPersonIndex;

    public ArrayAddressBook(int arraySize) {
        if (arraySize < 1) {
            arraySize = 1;
        }
        persons = new Person[arraySize];
        newPersonIndex = 0;
    }

    public void addPerson(Person person) {
        if (persons.length <= newPersonIndex) {
            resizeArray();
        }
        persons[newPersonIndex] = person;
        newPersonIndex++;

    }

    public void resizeArray() {
        int newSize = persons.length * 2;
        if (newSize == 0) {
            newSize = 1;
        }
        persons = Arrays.copyOf(persons, newSize);

    }

    public void print() {
        int einträge = 0;

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                einträge++;
            }
        }

        System.out.println("Einträge: " + einträge);
        System.out.println("Kapazität: " + persons.length);

        for (Person person : persons) {
            if (person != null) {
                person.print();
            }
        }
    }

}
