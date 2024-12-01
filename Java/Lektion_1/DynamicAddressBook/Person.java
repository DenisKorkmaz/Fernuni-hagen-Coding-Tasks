package DynamicAddressBook;

public class Person {

    private String name;
    private int birthday;

    public Person(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void print() {
        System.out.println("Name: " + name + ", Geburtstag: " + birthday);
    }

    public boolean isBirthday(int date) {
        return birthday % 10000 == date % 10000;
    }
}
