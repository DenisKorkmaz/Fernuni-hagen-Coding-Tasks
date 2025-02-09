package Lektion_2.ObjectContainerAdHoc7;

import Lektion_1.DynamicAddressBook.Person;

public class ObjectContainerTest {

    public static void main(String[] args) {

        ObjectContainer container = new ObjectContainer();
        Person person = new Person("Denis", 123123);
        container.store(person);
        Person x = (Person) container.get();
        System.out.println(x.getName());
    }

}
