package Lektion_5.adHocTasks.adHocTask1;

class PredicateLessThanSixtyKg implements FilterPredicate<Person> {
    @Override
    public boolean isMatching(Person candidate) {
        return candidate.getWeight() < 60;
    }
}
