package Lektion_6.adHocTasks.adHocTask2;

public class RingBuffer {
    private Product[] data;
    private int startPos;
    private String id;
    private int size;

    public RingBuffer(String id, int capacity) {
        this.id = id;
        data = new Product[capacity];
    }

    public synchronized void storeProduct(Product product)
            throws InterruptedException {
        while (size >= data.length) {
            wait();
        }
        int lastInsertionPos = (startPos + size - 1) % data.length;
        int insertPos = (lastInsertionPos + 1) % data.length;
        data[insertPos] = product;
        size++;
        System.out.println(id + ": " + size + " Produkte im Lager");
        notify();
    }

    public synchronized Product getProduct()
            throws InterruptedException {
        while (size <= 0) {
            wait();
        }
        size--;
        Product product = data[startPos];
        startPos = (startPos + 1) % data.length;
        System.out.println(id + ": " + size + " Produkte im Lager");
        notifyAll();
        return product;
    }
}