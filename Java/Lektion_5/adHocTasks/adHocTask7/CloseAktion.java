package Java.Lektion_5.adHocTasks.adHocTask7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CloseAktion extends WindowAdapter implements ActionListener {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0); 
    }
}
