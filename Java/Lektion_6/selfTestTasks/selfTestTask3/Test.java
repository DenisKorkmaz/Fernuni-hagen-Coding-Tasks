package Lektion_6.selfTestTasks.selfTestTask3;

class Test {
    public static void main(String[] args) {
        if (args.length >= 2) {
            Drucker drucker = new Drucker();
            Benutzer haensel = new Benutzer(drucker, args[0], 5);
            Benutzer gretel = new Benutzer(drucker, args[1], 5);
            haensel.start();
            gretel.start();
        } else {
            System.out.println("Bitte zwei Dateinamen als Argumente übergeben!");
        }
    }
}