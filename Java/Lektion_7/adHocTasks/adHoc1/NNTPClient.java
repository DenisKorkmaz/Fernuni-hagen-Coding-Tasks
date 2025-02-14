package Lektion_7.adHocTasks.adHoc1;

import javax.net.*;
import javax.net.ssl.*;
import java.io.*;
import java.net.*;

public class NNTPClient {
    private boolean writeDebugOutput;
    private Socket so;
    private BufferedReader fromServer;
    private BufferedWriter toServer;
    private int minimalPostingIndex;
    private int maximalPostingIndex;

    public NNTPClient(String host, boolean writeDebugOutput) throws IOException {
        this.writeDebugOutput = writeDebugOutput;
        SocketFactory factory = SSLSocketFactory.getDefault();
        so = factory.createSocket(host, 563); // Erläuterung siehe Text!
        toServer = new BufferedWriter(new OutputStreamWriter(so.getOutputStream(), "UTF-8"));
        fromServer = new BufferedReader(new InputStreamReader(so.getInputStream(), "UTF-8"));
        readLineFromServer();
    }

    public void authenticate(String user, String pass) throws IOException {
        writeLineToServer("authinfo user " + user);
        readLineFromServer();
        writeLineToServer("authinfo pass " + pass);
        readLineFromServer();
    }

    public void enterGroup(String groupName) throws IOException {
        writeLineToServer("group " + groupName);
        String response = readLineFromServer();
        String[] tokens = response.split(" ");
        minimalPostingIndex = Integer.parseInt(tokens[2]);
        maximalPostingIndex = Integer.parseInt(tokens[3]);
    }

    public String fetchPosting(int index) throws IOException {
        writeLineToServer("body " + index);
        readLineFromServer();
        StringBuilder sb = new StringBuilder();
        String line = ".";
        while (!(line = fromServer.readLine()).equals(".")) {
            sb.append(line).append('\n');
        }
        return sb.toString();
    }

    public void quit() throws IOException {
        so.close();
    }

    public int getMinimalPostingIndex() {
        return minimalPostingIndex;
    }

    public int getMaximalPostingIndex() {
        return maximalPostingIndex;
    }

    private String readLineFromServer() throws IOException {
        String line = fromServer.readLine();
        if (writeDebugOutput) {
            System.out.println(line);
        }
        return line;
    }

    private void writeLineToServer(String message) throws IOException {
        toServer.write(message + "\r\n");
        toServer.flush();
        if (writeDebugOutput) System.out.println("--> " + message);
    }

    public void postMessage(String from, String newsgroup, String subject, String message) throws IOException {
        writeLineToServer("post");
        String response = readLineFromServer();
        if (!response.startsWith("340")) {
            throw new IOException("Posten nicht erlaubt!" + response);

        }
        sendHeadersAndMessage(from, newsgroup, subject, message);
    }

    private void sendHeadersAndMessage(String from, String newsgroup, String subject, String message) throws IOException {
        writeLineToServer("From:" + from);
        writeLineToServer("Subject:" + subject);
        writeLineToServer("Newsgroups:" + newsgroup);
        writeLineToServer("");

        BufferedReader reader = new BufferedReader(new StringReader(message));

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            toServer.write(line + "\r\n");
            toServer.flush();
        }
        writeLineToServer(".");
        readLineFromServer();
    }
}
