package Lektion_6.selfTestTasks.selfTestTask2;

class WerteTauscher extends Thread {
    Foo a;
    Foo b;
    private static final Object LOCK = new Object();


    WerteTauscher(Foo a, Foo b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (LOCK) {
            int h = a.wert;
            a.wert = b.wert;
            b.wert = h;
        }
    }
}