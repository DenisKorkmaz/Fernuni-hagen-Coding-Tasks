package Lektion_6.adHocTasks.adHocTask1;

class KontoTest {
    public static void main(String[] args) throws InterruptedException {
        Konto konto = new Konto(1000);
        Thread A = new Einzahler(konto, 2000);
        Thread B = new Einzahler(konto, 4000);
        A.start();
        B.start();
        A.join();
        B.join();
        konto.printSaldo();
    }
}