package selfTestTasks;

public class sortArray {
    public static void main(String[] args) {

        double[] doubleArray = new double[args.length];

        for (int i = 0; i < args.length; i++) {
            doubleArray[i] = Double.parseDouble(args[i]);
        }

        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = i + 1; j < doubleArray.length; j++) {

                if (doubleArray[i] < doubleArray[j]) {
                    double tempVar = doubleArray[j];
                    doubleArray[j] = doubleArray[i];
                    doubleArray[i] = tempVar;
                }

            }
        }

        System.out.println("größten Element: " + doubleArray[0]);

        for (int i = 0; i < args.length; i = i + 1) {
            System.out.println(i + ". " + doubleArray[i]);
        }
    }

}
