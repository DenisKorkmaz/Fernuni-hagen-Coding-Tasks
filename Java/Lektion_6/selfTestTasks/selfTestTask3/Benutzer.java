package Lektion_6.selfTestTasks.selfTestTask3;

class Benutzer extends Thread {
    private Drucker drucker;
    private String dateiname;
    private int anzahl;

    Benutzer(Drucker drucker, String dateiname, int anzahl) {
        this.drucker = drucker;
        this.dateiname = dateiname;
        this.anzahl = anzahl;
    }

    @Override
    public void run() {
        synchronized (drucker) {
            for (int i = 0; i < anzahl; i++) {
                drucker.druckeDatei(dateiname);
            }
            //Thread.yield();
        }
    }
}