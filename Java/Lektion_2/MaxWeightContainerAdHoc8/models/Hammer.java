package Lektion_2.MaxWeightContainerAdHoc8.models;

import Lektion_2.MaxWeightContainerAdHoc8.interfaces.Weighable;

public class Hammer implements Weighable {
    private double weight;

    public Hammer(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
