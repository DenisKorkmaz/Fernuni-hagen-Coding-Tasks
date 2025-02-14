package Lektion_5.adHocTasks.adHocTask1;

import java.util.ArrayList;
import java.util.List;

public class Filter<T> {
    private List<T> sourceList;

    public Filter(List<T> sourceList) {
        this.sourceList = sourceList;
    }

    List<T> filter(FilterPredicate<T> filterPredicate) {
        ArrayList<T> resultList = new ArrayList<>();
        for (T elem : sourceList) {
            if (filterPredicate.isMatching(elem)) {
                resultList.add(elem);
            }
        }
        return resultList;
    }
}
