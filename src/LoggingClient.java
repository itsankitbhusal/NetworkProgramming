import java.io.*;
import java.net.*;

public class LoggingClient {

  public static void main(String[] args) {
    String serverAddress = "127.0.0.1"; // Change this to your server's IP address
    int serverPort = 9999;

    try (
      Socket socket = new Socket(serverAddress, serverPort);
      BufferedReader in = new BufferedReader(
        new InputStreamReader(socket.getInputStream())
      )
    ) {
      String response;
      while ((response = in.readLine()) != null) {
        System.out.println("Server response: " + response);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
