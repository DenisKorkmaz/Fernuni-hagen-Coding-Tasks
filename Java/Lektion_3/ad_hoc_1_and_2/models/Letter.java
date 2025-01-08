package Java.Lektion_3.ad_hoc_1_and_2.models;

import Java.Lektion_3.ad_hoc_1_and_2.interfaces.PostalItem;
import Java.Lektion_3.ad_hoc_1_and_2.interfaces.Weighable;

public class Letter implements PostalItem, Weighable {

    private boolean send;
    private double weight;

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
