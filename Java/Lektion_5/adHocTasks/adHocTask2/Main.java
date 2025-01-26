package Java.Lektion_5.adHocTasks.adHocTask2;

public class Main {
    public static void main(String[] args) {
        WakeUpService wakeUpDenis = new WakeUpService(6);
        WakeUpService wakeUpGina = new WakeUpService(9);

        wakeUpDenis.register(new WakeUpServiceClient() {
            @Override
            public void wakeUp(int time) {
                System.out.print("Oh, schon " + time + " Uhr.");
                System.out.println("Dann will ich mal aufstehen.");
            }

        });
        wakeUpGina.register(new WakeUpServiceClient() {
            @Override
            public void wakeUp(int time) {
                System.out.print("Oh, schon " + time + " Uhr.");
                System.out.println("Dann will ich mal aufstehen.");
            }

        });

        new Thread(wakeUpDenis::startService).start();
        new Thread(wakeUpGina::startService).start();


    }
}