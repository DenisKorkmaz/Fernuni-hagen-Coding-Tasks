package Lektion_5.SelfTestTasks.selfTestTask2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AddiererTest {
    public static void main(String[] args) {
        MiniRechner f = new AddiererSpez();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}