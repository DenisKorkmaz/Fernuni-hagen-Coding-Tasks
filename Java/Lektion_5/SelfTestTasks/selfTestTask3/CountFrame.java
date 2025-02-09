package Lektion_5.SelfTestTasks.selfTestTask3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountFrame extends Frame implements ActionListener {
    public Button crement;
    public Button decrement;
    public Button reset;
    public TextField valueTextField;
    public Counter counter = new Counter(50);

    public CountFrame() {
        setLayout(new BorderLayout());
        Panel p = new Panel();
        setSize(200, 100);
        crement = new Button(">");
        decrement = new Button("<");
        reset = new Button("RESET");
        valueTextField = new TextField(counter.toString(), 2);
        valueTextField.setEditable(false);
        p.add(decrement);

        p.add(valueTextField);

        p.add(crement);
        add(p, BorderLayout.CENTER);

        add(reset, BorderLayout.SOUTH);
        crement.addActionListener(this);
        decrement.addActionListener(this);
        reset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value = counter.toString();
        System.out.println(value);
        try {
            if (e.getSource() == crement) {
                counter.increment();
                valueTextField.setText(value);
            }
            if (e.getSource() == decrement) {
                counter.decrement();
                valueTextField.setText(value);

            }
            if (e.getSource() == reset) {
                counter.reset();
                valueTextField.setText(value);

            }
        } catch (NumberFormatException ex) {
            System.out.println("Ungültiger Eingabewert " + ex.getMessage());
        }
    }

}
