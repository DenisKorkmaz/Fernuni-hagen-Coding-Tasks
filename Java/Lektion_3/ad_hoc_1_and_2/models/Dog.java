package Lektion_3.ad_hoc_1_and_2.models;

import Lektion_3.ad_hoc_1_and_2.interfaces.Weighable;

public class Dog implements Weighable {

    private final double weight;

    public Dog(double weight) {
        this.weight = weight;

    }

    @Override
    public double weigh() {
        return weight;
    }

}
