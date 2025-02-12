package Lektion_6.selfTestTasks.selfTestTask4;

public class CountFrame extends java.awt.Frame implements java.awt.event.ActionListener {
    public java.awt.Button interrupt;
    public java.awt.TextField valueTextField;
    public Counter counter;
    private CountThread countThread;




    public CountFrame() {
        counter = new Counter(1);
        countThread = new CountThread(counter,this);
        setLayout(new java.awt.BorderLayout());
        java.awt.Panel p = new java.awt.Panel();
        setSize(200, 100);
        interrupt = new java.awt.Button("QUIT");
        valueTextField = new java.awt.TextField(counter.toString(), 2);
        valueTextField.setEditable(false);

        p.add(valueTextField);

        add(p, java.awt.BorderLayout.CENTER);

        add(interrupt, java.awt.BorderLayout.SOUTH);
        interrupt.addActionListener(this);
        countThread.start();
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        try {
            if (e.getSource() == interrupt) {
                System.out.println("Zähler unterbrochen bei: " + counter.toString());
                countThread.interrupt();
                System.exit(0);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Ungültiger Eingabewert " + ex.getMessage());
        }
    }

}
