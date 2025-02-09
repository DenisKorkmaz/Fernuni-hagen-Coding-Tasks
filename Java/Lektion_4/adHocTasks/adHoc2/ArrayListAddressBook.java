package Lektion_4.adHocTasks.adHoc2;

import Lektion_1.DynamicAddressBook. Person;

import java.util.ArrayList;

public class ArrayListAddressBook {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public ArrayListAddressBook(int initialCapacity) {
        initialCapacity = initialCapacity < 1 ? 1 : initialCapacity;
        persons = new java.util.ArrayList<Person>(initialCapacity);
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void print() {
        System.out.println("Kapazität: " + persons.size());

        for (Person person : persons) {
            if (person != null) {
                person.print();
            }
        }
    }

}
