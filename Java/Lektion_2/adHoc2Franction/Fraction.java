package Java.Lektion_2.adHoc2Franction;

public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

    }

    public Fraction getProductOfThisAnd(Fraction objFraction) {
        int newNumerator = objFraction.numerator * numerator;
        int newDenominator = objFraction.denominator * denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public String toString() {
        return String.valueOf(numerator) + '/' + String.valueOf(denominator);
    }

}
