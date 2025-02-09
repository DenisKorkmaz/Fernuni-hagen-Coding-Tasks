package Lektion_4.selfTestTasks.selfTest2;

public class PDF implements Druckbar {

    private String content;

    public PDF(String content) {
        this.content = content;
    }

    @Override
    public void drucken() {
        System.out.println(content);
    }

}
