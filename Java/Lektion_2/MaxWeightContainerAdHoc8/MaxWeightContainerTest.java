package Lektion_2.MaxWeightContainerAdHoc8;

import Lektion_2.MaxWeightContainerAdHoc8.containers.MaxWeightContainer;
import Lektion_2.MaxWeightContainerAdHoc8.interfaces.Weighable;
import Lektion_2.MaxWeightContainerAdHoc8.models.Animal;
import Lektion_2.MaxWeightContainerAdHoc8.models.Apple;
import Lektion_2.MaxWeightContainerAdHoc8.models.Hammer;

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
