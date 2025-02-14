package Lektion_6.adHocTasks.adHocTask2;

import java.util.Random;

public class Producer extends Thread {
    private static Random random = new Random();
    private RingBuffer buffer;

    Producer(RingBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            Product product = new Product();
            try {
                sleep(random.nextInt(500));
                buffer.storeProduct(product);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}
