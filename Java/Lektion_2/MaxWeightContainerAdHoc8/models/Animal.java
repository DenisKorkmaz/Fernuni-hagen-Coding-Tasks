package Java.Lektion_2.MaxWeightContainerAdHoc8.models;
import Java.Lektion_2.MaxWeightContainerAdHoc8.interfaces.Weighable;


public class Animal implements Weighable {
    private double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
