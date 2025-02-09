package Lektion_2.MaxWeightContainerAdHoc8.models;

import Lektion_2.MaxWeightContainerAdHoc8.interfaces.Weighable;

public class Apple implements Weighable {
    private double weight;

    public Apple(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
