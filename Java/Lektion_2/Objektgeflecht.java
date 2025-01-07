package Java.Lektion_2;

public class Objektgeflecht {
    Objektgeflecht a, b, c;

    public Objektgeflecht() {
        a = null;
        b = null;
        c = null;
    }

    public Objektgeflecht(Objektgeflecht a, Objektgeflecht b, Objektgeflecht c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] argv) {
        Objektgeflecht u = new Objektgeflecht();
        Objektgeflecht v = new Objektgeflecht();
        Objektgeflecht w = new Objektgeflecht(u, v, null);
        w.a.b = v;
        v.a = u.b;
        u.b.c = w;
        w.c = v.c;
        u.c = v.a.c;
        /* Markierung */ }
}
