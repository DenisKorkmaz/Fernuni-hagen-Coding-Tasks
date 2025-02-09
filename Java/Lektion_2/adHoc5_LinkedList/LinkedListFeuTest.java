package Lektion_2.adHoc5_LinkedList;

import Lektion_1.DynamicAddressBook.*;

import java.util.NoSuchElementException;

public class LinkedListFeuTest {
    public static void main(String[] args) {

        LinkedListFeu list = new LinkedListFeu();
        list.addPerson(new Person("Sok", 19434491));
        list.addPerson(new Person("Ali", 19434411));
        list.addPerson(new Person("Maria", 19444411));


        try {
            System.out.println("Element an Position 1: " + list.getElementAt(0).getName());
            System.out.println("Element an Position 2: " + list.getElementAt(1).getName());
            System.out.println("Element an Position 3: " + list.getElementAt(2).getName());
            System.out.println("Element an Position 9: " + list.getElementAt(9).getName());
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
        }

    }
}
