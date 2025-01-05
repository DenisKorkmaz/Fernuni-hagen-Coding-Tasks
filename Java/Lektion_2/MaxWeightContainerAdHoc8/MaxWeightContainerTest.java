package Java.Lektion_2.MaxWeightContainerAdHoc8;

import Java.Lektion_2.MaxWeightContainerAdHoc8.models.Animal;
import Java.Lektion_2.MaxWeightContainerAdHoc8.models.Apple;
import Java.Lektion_2.MaxWeightContainerAdHoc8.models.Hammer;
import Java.Lektion_2.MaxWeightContainerAdHoc8.containers.MaxWeightContainer;
import Java.Lektion_2.MaxWeightContainerAdHoc8.interfaces.Weighable;

public class MaxWeightContainerTest {
    public static void main(String[] args) {
        MaxWeightContainer container = new MaxWeightContainer();

        container.store(new Animal(50.0));
        container.store(new Apple(1.2));
        container.store(new Hammer(3.5));

        Weighable heaviestObject = container.getHeaviest();


        System.out.println("Heaviest item weight: " + heaviestObject.getWeight());
    }
}
