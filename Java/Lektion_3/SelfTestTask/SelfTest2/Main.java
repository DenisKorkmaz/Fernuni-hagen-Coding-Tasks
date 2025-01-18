package Java.Lektion_3.SelfTestTask.SelfTest2;

public class Main {
    public static void main(String[] args) {
        Wochentage sonntag = Wochentage.SONNTAG;

        System.out.println("Aktueller Tag: " + sonntag);
        System.out.println("Nächster Tag: " + sonntag.naechsterTag());
        System.out.println("Voriger Tag: " + sonntag.vorrigerTag());
        System.out.println("ist Arbeitstag: " + sonntag.isWorkday());
    }
}
