package Lektion_5.SelfTestTasks.selfTestTask2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class AddiererSpez extends MiniRechner implements ActionListener {
    AddiererSpez() {
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b1) {
                int sum = Integer.parseInt(t1.getText()) +
                        Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(sum));
            }
            if (e.getSource() == b2) {
                int product = Integer.parseInt(t1.getText()) *
                        Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(product));
            }
        } catch (NumberFormatException ex) {
            System.out.println("Ungültiger Eingabewert für t1 " +
                    "oder t2 : " + ex.getMessage());
        }
    }
}
