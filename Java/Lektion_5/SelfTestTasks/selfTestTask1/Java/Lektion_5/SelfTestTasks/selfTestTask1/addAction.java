package Java.Lektion_5.SelfTestTasks.selfTestTask1;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addAction implements ActionListener {

    private TextField t1, t2, t3;

    public addAction(TextField t1, TextField t2, TextField t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int t1INT = Integer.parseInt(t1.getText());
        int t2INT = Integer.parseInt(t2.getText());
        int sum = t1INT + t2INT;
        t3.setText(String.valueOf(sum));
        System.out.println("Text geändert: " + t1INT + " " + t2INT);
    }
}
