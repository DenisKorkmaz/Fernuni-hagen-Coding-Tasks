package Lektion_5.SelfTestTasks.selfTestTask2;

import java.awt.*;


public class MiniRechner extends Frame {
    public Button b1;
    public Button b2;
    public TextField t1;
    public TextField t2;
    public TextField t3;

    public MiniRechner() {
        setLayout(new FlowLayout());
        setSize(300, 100);
        b1 = new Button("addiere");
        b2 = new Button("multipliziere");
        t1 = new TextField("4", 4);
        t2 = new TextField("2", 4);
        t3 = new TextField(4);
        t3.setEditable(false);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
    }

}
