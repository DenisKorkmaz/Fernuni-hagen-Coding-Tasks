package Lektion_6.adHocTasks.adHocTask1;

class Einzahler extends Thread {
    private Konto konto;
    private int betrag;

    public Einzahler(Konto konto, int betrag) {
        this.konto = konto;
        this.betrag = betrag;
    }

    @Override
    public void run() {
        konto.einzahlen(betrag);
    }
}