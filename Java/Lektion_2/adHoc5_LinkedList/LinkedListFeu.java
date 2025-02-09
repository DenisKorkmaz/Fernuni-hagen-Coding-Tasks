package Lektion_2.adHoc5_LinkedList;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import Lektion_1.DynamicAddressBook.Person;

public class LinkedListFeu {

    private LinkedList<Person> persons = new LinkedList<Person>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public Person getElementAt(int position) {
        if (position >= 0 && position < persons.size()) {
            return persons.get(position);
        } else {
            throw new NoSuchElementException("Ungültige Position: " + position);
        }
    }

}
