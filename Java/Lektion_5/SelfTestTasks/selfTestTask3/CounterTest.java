package Lektion_5.SelfTestTasks.selfTestTask3;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class CounterTest {
    public static void main(String[] args) {
        CountFrame f = new CountFrame();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}