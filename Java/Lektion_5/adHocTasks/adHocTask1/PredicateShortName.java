package Java.Lektion_5.adHocTasks.adHocTask1;

class PredicateShortName implements FilterPredicate<Person> {
    @Override
    public boolean isMatching(Person candidate) {
        return candidate.getName().length() < 5;
    }
}