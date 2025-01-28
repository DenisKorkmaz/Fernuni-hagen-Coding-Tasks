package Java.Lektion_5.adHocTasks.adHocTask7;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import Java.Lektion_5.adHocTasks.adHocTask6.BaseFrame;

public class TestButton {
    public static void main(String[] args) {
        Frame f = new BaseFrame();
        Button exitButton = new Button("Programm beenden");

        f.setLayout(new FlowLayout());
        CloseAktion close = new CloseAktion();
        f.addWindowListener(close);
        exitButton.addActionListener(close);

        f.add(exitButton);

        f.setVisible(true);
    }
}
