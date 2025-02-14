package Lektion_7.adHocTasks.adHoc1;

import java.io.*;

public class NNTPClientTest {
    public static void main(String[] args) throws IOException {
        NNTPClient client = new NNTPClient("news.fernuni-hagen.de", true);
        client.authenticate("xxx", "yyy");
        String message = "Dies ist ein Test.\n";
        client.postMessage("yyy@studium.fernuni-hagen.de", "feu.test", "Lektion 7 ad-hoc 1", message);
        client.quit();
    }
}
