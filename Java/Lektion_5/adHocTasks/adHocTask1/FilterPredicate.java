package Lektion_5.adHocTasks.adHocTask1;

public interface FilterPredicate<T> {
    boolean isMatching(T candidate);
}