package Lektion_6.selfTestTasks.selfTestTask1;

class Test {
    public static void main(String[] argv) {
        TicketAnbieter ta = new TicketAnbieter(2);

        Thread thread1 = new Thread(new Reisebuero("Reiseland", ta));
        Thread thread2 = new Thread(new Reisebuero("Happy Travel", ta));

        thread1.start();
        thread2.start();

    }
}