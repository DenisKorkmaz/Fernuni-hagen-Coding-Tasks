package Java.Lektion_5.SelfTestTasks.selfTestTask1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AddiererTest {
    public static void main(String[] argv) {
        Addierer f = new Addierer();
        addAction listener = new addAction(f.t1, f.t2, f.t3);

        f.b1.addActionListener(listener);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}