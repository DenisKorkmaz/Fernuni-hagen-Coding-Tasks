package Lektion_6.adHocTasks.adHocTask2;

public class ErzeugerVerbraucherTest {
    public static void main(String[] args) {
        RingBuffer buffer = new RingBuffer("Puffer", 4);
        Producer producer = new Producer(buffer);
        Producer producer2 = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        Consumer consumer2 = new Consumer(buffer);
        Consumer consumer3 = new Consumer(buffer);
        Consumer consumer4 = new Consumer(buffer);
        Consumer consumer5 = new Consumer(buffer);
        Consumer consumer6 = new Consumer(buffer);
        producer.start();
        producer2.start();
        System.out.println("Erzeuger nimmt Arbeit auf");
        consumer.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
        consumer5.start();
        consumer6.start();
        System.out.println("Verbraucher nimmt Arbeit auf");
    }
}
