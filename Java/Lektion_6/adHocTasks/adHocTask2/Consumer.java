package Lektion_6.adHocTasks.adHocTask2;

public class Consumer extends Thread {
    private RingBuffer buffer;

    Consumer(RingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Product product = buffer.getProduct();
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}