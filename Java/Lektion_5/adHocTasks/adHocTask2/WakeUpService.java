package Java.Lektion_5.adHocTasks.adHocTask2;

import java.time.LocalTime;
import java.util.ArrayList;

public class WakeUpService {

    private int wakeUpTime;
    private ArrayList<WakeUpServiceClient> beobachterListe = new ArrayList<WakeUpServiceClient>();

    public WakeUpService(int wakeUpTime) {
        if (wakeUpTime < 1 || wakeUpTime > 23) {
            System.out.println("Zeit nich gültig!");
        } else {
            this.wakeUpTime = wakeUpTime;
        }
    }

    public void register(WakeUpServiceClient client) {
        beobachterListe.add(client);
    }

    public int getWakeUpTime() {
        return wakeUpTime;
    }

    private void wakeUpAllClients() {
        for (WakeUpServiceClient client : beobachterListe) {
            client.wakeUp(wakeUpTime);
        }
    }

    public void startService() {
        boolean finished = false;
        System.out.println("Weckdienst für Weckzeit " + wakeUpTime + ":00 Uhr gestartet.");
        while (!finished) {
            int currentHour = LocalTime.now().getHour();
            if (currentHour == wakeUpTime) {
                wakeUpAllClients();
                finished = true;
            }
            try {
                Thread.sleep(1000); // Eine Sekunde Pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
