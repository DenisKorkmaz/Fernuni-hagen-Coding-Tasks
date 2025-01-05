package Java.Lektion_2.selfTestTasks.PrintableList;
import Java.Lektion_2.selfTestTasks.PrintableList.list.PrintableList;
import Java.Lektion_2.selfTestTasks.PrintableList.models.Book;
import Java.Lektion_2.selfTestTasks.PrintableList.models.Cat;
import Java.Lektion_2.selfTestTasks.PrintableList.models.Person;

public class PrintableListTest {

    public static void main(String[] args) {

        PrintableList list = new PrintableList();
        Person denis = new Person("Denis");
        Cat diego = new Cat();
        Cat romy = new Cat();
        Cat luna = new Cat();
        Book book = new Book("Harry Potter");
        Person gina = new Person("Gina");

        list.add(denis);
        list.add(diego);
        list.add(romy);
        list.add(luna);
        list.add(book);
        list.add(gina);

        PrintableList.ListIterator iterator = list.listIterator();

        int i = 0;
        while (i < list.size()) {
            System.out.println(iterator.next().print());
            i++;
        }
    }

}
