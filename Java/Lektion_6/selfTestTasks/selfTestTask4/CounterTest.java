package Lektion_6.selfTestTasks.selfTestTask4;

class CounterTest {
    public static void main(String[] args) {
        Lektion_6.selfTestTasks.selfTestTask4.CountFrame f = new Lektion_6.selfTestTasks.selfTestTask4.CountFrame();
        f.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}