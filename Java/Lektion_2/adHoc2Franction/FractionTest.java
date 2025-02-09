package Lektion_2.adHoc2Franction;

public class FractionTest {
    public static void main(String[] args) {

        Fraction fraction = new Fraction(8, 2);
        System.out.println("Fraction: " + fraction);

        Fraction getProduct = fraction.getProductOfThisAnd(new Fraction(6, 3));
        System.out.println("Product: " + getProduct);

        Fraction fractionZeroDenominator = new Fraction(3, 0);
        System.out.println("Denominator is Zero: " + fractionZeroDenominator);

    }
}
