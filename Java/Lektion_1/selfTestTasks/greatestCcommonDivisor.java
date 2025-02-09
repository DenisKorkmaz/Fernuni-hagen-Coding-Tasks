package Lektion_1.selfTestTasks;

public class greatestCcommonDivisor {
    public static void main(String[] args) {

        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        int smallerNumber = firstNumber > secondNumber ? secondNumber : firstNumber;

        for (int i = smallerNumber; i != 0; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                switch (i) {
                    case 1:
                        System.out.println(i);
                        break;
                    case 2:
                        System.out.println(i);
                        break;
                    case 3:
                        System.out.println(i);
                        break;
                    case 4:
                        System.out.println(i);
                        break;
                    default:
                        System.out.println("Größer als 4");
                }
                break;
            }
        }
        main(new String[]{"12", "18"});

    }

}