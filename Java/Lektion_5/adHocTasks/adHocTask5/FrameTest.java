package Java.Lektion_5.adHocTasks.adHocTask5;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(300, 400);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setLocationRelativeTo(null);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }
}
