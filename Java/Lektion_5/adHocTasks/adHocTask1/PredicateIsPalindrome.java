package Lektion_5.adHocTasks.adHocTask1;

class PredicateIsPalindrome implements FilterPredicate<Person> {
    @Override
    public boolean isMatching(Person candidate) {

        StringBuilder str = new StringBuilder(candidate.getName());
        str = str.reverse();
        String reverseName = str.toString().toLowerCase();
        String name = candidate.getName().toLowerCase();
        return name.equals(reverseName);
    }
}

