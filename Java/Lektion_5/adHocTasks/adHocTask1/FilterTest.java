package Lektion_5.adHocTasks.adHocTask1;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        ArrayList<Person> source = new ArrayList<>();
        source.add(new Person("Joe", 77.0));
        source.add(new Person("Bob", 90.2));
        source.add(new Person("Jenny", 44.2));
        source.add(new Person("Anna", 51.9));
        source.add(new Person("Peter", 84.3));

        Filter<Person> personFilter = new Filter<>(source);
        FilterPredicate<Person> hasShortName = new PredicateShortName();
        FilterPredicate<Person> isLessThanSixtyKg = new PredicateLessThanSixtyKg();
        //FilterPredicate<Person> isPalindrome = new PredicateIsPalindrome();


        List<Person> result = personFilter.filter(hasShortName);
        List<Person> result2 = personFilter.filter(isLessThanSixtyKg);
        // List<Person> result3 = personFilter.filter(isPalindrome);

        List<Person> isPalindrome = personFilter.filter(
                p -> {
                    StringBuilder str = new StringBuilder(p.getName());
                    str = str.reverse();
                    String reverseName = str.toString().toLowerCase();
                    String name = p.getName().toLowerCase();
                    return name.equals(reverseName);
                }
        );

        for (Person person : result) {
            System.out.println("hasShortName " + person.getName());
        }
        for (Person person : result2) {
            System.out.println("isLessThanSixtyKg " + person.getName());
            System.out.println(person.getWeight());
        }
        for (Person person : isPalindrome) {
            System.out.println("isPalindrome " + person.getName());
        }
    }
}
