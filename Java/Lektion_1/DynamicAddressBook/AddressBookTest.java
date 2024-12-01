package DynamicAddressBook;

public class AddressBookTest {

    public static void main(String[] args) {

        ArrayAddressBook addressBook = new ArrayAddressBook(3);
        addressBook.print();
        Person person1 = new Student("Denis", 19003333, 12345, 2);
        Person person2 = new Student("Ginimi", 22112211, 678910, 5);
        Person person3 = new Person("Maria", 19444411);
        Person person4 = new Person("Maus", 45402308);

        addressBook.addPerson(person1);
        addressBook.print();

        addressBook.addPerson(person2);
        addressBook.print();

        addressBook.addPerson(person3);
        addressBook.print();

        addressBook.addPerson(person4);
        addressBook.print();

    }
}
