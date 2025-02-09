package Lektion_4.adHocTasks.adHoc1;

import java.util.Arrays;

public class ListWithArray<ET> {

    int nextFreeIndex;
    private Object[] internArray;

    public ListWithArray(int arraySize) {
        if (arraySize < 1) {
            arraySize = 1;
        }
        internArray = new Object[arraySize];
    }

    public void resizeArray() {
        int newSize = internArray.length * 2;
        if (newSize == 0) {
            newSize = 1;
        }
        internArray = Arrays.copyOf(internArray, newSize);

    }

    @SuppressWarnings("unchecked")
    ET getLast() {
        if (nextFreeIndex == 0)
            throw new java.util.NoSuchElementException();
        return (ET) internArray[nextFreeIndex - 1];
    }

    @SuppressWarnings("unchecked")
    ET removeLast() {
        if (nextFreeIndex == 0)
            throw new java.util.NoSuchElementException();
        ET lastElement = (ET) internArray[nextFreeIndex - 1];
        nextFreeIndex--;
        internArray[nextFreeIndex] = null;
        return lastElement;
    }

    void addLast(ET element) {

        if (internArray.length <= nextFreeIndex) {
            resizeArray();
        }
        internArray[nextFreeIndex] = element;
        nextFreeIndex++;
    }

    int nextFreeIndex() {
        return nextFreeIndex;
    }

}
