package Java.Lektion_4.selfTestTasks.selfTest2;

public class Tupel<T extends Druckbar> {
    private T links;
    private T rechts;

    public Tupel(T links, T rechts) {
        this.links = links;
        this.rechts = rechts;
    }

    public T getLinks() {
        System.out.println(links);
        return links;
    }

    public void beideDrucken() {
        links.drucken();
        rechts.drucken();
    }

    public T getRechts() {
        System.out.println(rechts);
        return rechts;
    }
}
