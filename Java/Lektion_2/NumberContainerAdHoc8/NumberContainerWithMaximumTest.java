package Lektion_2.NumberContainerAdHoc8;

public class NumberContainerWithMaximumTest {

    public static void main(String[] args) {

        NumberContainerWithMaximum newMaximumContainer = new NumberContainerWithMaximum();
        newMaximumContainer.store(3);
        newMaximumContainer.store(10);
        newMaximumContainer.store(5);
        System.out.println(newMaximumContainer.getMaximum());

    }
}
