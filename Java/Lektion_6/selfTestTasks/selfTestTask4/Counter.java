package Lektion_6.selfTestTasks.selfTestTask4;

public class Counter {
    private int startValue;
    private int value;
    private int min = 0;
    private int max = 99;

    Counter(int start) {
        startValue = start;
        value = start;
    }

    void increment() throws InterruptedException {
        if (value < max) {
            value++;
            Thread.sleep(500);
        }
    }


    @Override
    public String toString() {
        return "" + value;
    }
}
