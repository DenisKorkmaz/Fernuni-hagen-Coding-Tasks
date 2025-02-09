package Lektion_2.ToyFactory_adHoc4;

public class ToyFactory {

    public static Toy getToy(String toyName) throws NoSuchToyException {
        switch (toyName) {
            case "PlasticCar":
                return new PlasticCar();
            case "TeddyBear":
                return new TeddyBear();
            case "RubberDuck":
                return new RubberDuck();
            default:
                throw new NoSuchToyException("Toy not found: " + toyName);
        }
    }

}
