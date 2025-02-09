package Lektion_6.adHocTasks.adHocTask1;

class Konto {
    private int saldo;

    public Konto(int saldo) {
        this.saldo = saldo;
    }

    public void einzahlen(int betrag) {
        int temp = saldo + betrag;
        //Thread.yield();
        saldo = temp;
    }

    public void printSaldo() {
        System.out.println(String.valueOf(saldo));
    }
}