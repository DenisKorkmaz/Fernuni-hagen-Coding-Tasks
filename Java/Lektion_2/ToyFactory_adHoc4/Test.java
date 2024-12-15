package Java.Lektion_2.ToyFactory_adHoc4;

public class Test {

    public static void main(String[] args) {

        try {
            Toy plasticCar = ToyFactory.getToy("PlasticCar");
            plasticCar.print();

            Toy teddyBear = ToyFactory.getToy("TeddyBear");
            teddyBear.print();

            Toy rubberDuck = ToyFactory.getToy("RubberDuck");
            rubberDuck.print();

            Toy barbie = ToyFactory.getToy("Barbie");
            barbie.print();

        } catch (NoSuchToyException e) {
            System.out.println(e);
        }
    }

}
