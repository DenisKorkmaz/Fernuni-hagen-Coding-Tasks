package Java.Lektion_5.adHocTasks.adHocTask6;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BaseFrame extends Frame {
    public BaseFrame() {
       // addWindowListener(new WindowAdapter() {
         //   @Override
           // public void windowClosing(WindowEvent e) {
             //   System.exit(0);
          //  }
        //});

        setSize(300, 400);
        setLocationRelativeTo(null);
    }
}