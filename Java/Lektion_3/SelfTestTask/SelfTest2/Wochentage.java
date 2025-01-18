package Java.Lektion_3.SelfTestTask.SelfTest2;

public enum Wochentage {

    MONTAG(true),
    DIENSTAG(true),
    MITTWOCH(true),
    DONNERSTAG(true),
    FREITAG(true),
    SAMSTAG(false),
    SONNTAG(false);

    private final Boolean workday;

    private Wochentage(Boolean workday) {
        this.workday = workday;
    }

    @Override
    public String toString() {
        switch (this) {
            case MONTAG:
                return "Mo";
            case DIENSTAG:
                return "Di";
            case MITTWOCH:
                return "Mi";
            case DONNERSTAG:
                return "Do";
            case FREITAG:
                return "Fr";
            case SAMSTAG:
                return "Sa";
            case SONNTAG:
                return "So";
            default:
                return "Wochentag nicht erkannt";
        }
    }

    public Boolean isWorkday() {
        return workday;
    }

    public Wochentage vorrigerTag() {
        return Wochentage.values()[(ordinal() - 1) % 7];

    }

    public Wochentage naechsterTag() {
        return Wochentage.values()[(ordinal() + 1) % 7];
    }
}
