package Lektion_6.selfTestTasks.selfTestTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

class Drucker {
    synchronized void druckeDatei(String dateiname) {
        try (BufferedReader in = new BufferedReader(new FileReader(dateiname))) {
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}