package Lektion_3.ad_hoc_1_and_2.models;

import Lektion_3.ad_hoc_1_and_2.interfaces.PostalItem;
import Lektion_3.ad_hoc_1_and_2.interfaces.Weighable;

public class Letter implements PostalItem, Weighable {

    private final boolean send;
    private final double weight;

    public Letter(double weight, boolean send) {
        this.weight = weight;
        this.send = send;

    }

    @Override
    public boolean sendItem() {
        return send;
    }

    @Override
    public double weigh() {
        return weight;
    }

}
