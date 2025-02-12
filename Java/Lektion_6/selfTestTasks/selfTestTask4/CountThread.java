package Lektion_6.selfTestTasks.selfTestTask4;

public class CountThread extends Thread {

    private Counter counter;
    private CountFrame countFrame;

    public CountThread(Counter counter, CountFrame countFrame) {
        this.counter = counter;
        this.countFrame = countFrame;
    }


    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                counter.increment();
                countFrame.valueTextField.setText(counter.toString());
            } catch (InterruptedException e) {
                System.out.println("Zähler wurde unterbrochen. Letzter Wert: " + counter.toString());
            }
        }
    }
}