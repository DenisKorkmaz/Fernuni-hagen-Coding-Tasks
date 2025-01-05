package Java.Lektion_2.MaxWeightContainerAdHoc8.containers;

import Java.Lektion_2.MaxWeightContainerAdHoc8.interfaces.Weighable;

public class MaxWeightContainer {
    private Weighable heaviest;

    public void store(Weighable element) {
        if (heaviest == null || element.getWeight() > heaviest.getWeight()) {
            heaviest = element;
        }
    }

    public Weighable getHeaviest() {
        return heaviest;
    }
}
