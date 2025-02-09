package Lektion_5.adHocTasks.adHocTask7;

import Lektion_5.adHocTasks.adHocTask6.BaseFrame;

import java.awt.*;

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
