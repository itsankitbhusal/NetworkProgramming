import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;

public class LoggingServer {

  public static final int PORT = 9999;
  private static final Logger auditLogger = Logger.getLogger("requests");
  private static final Logger errorLogger = Logger.getLogger("errors");

  public static void main(String[] args) {
    try {
      ServerSocket server = new ServerSocket(PORT);
      System.out.println("Server started. Listening on port " + PORT);

      while (true) {
        try {
          Socket connection = server.accept();
          handleConnection(connection);
        } catch (IOException ex) {
          errorLogger.log(Level.SEVERE, "accept error", ex);
        } catch (RuntimeException ex) {
          errorLogger.log(
            Level.SEVERE,
            "unexpected error " + ex.getMessage(),
            ex
          );
        }
      }
    } catch (IOException ex) {
      errorLogger.log(Level.SEVERE, "Couldn't start server", ex);
    } catch (RuntimeException ex) {
      errorLogger.log(
        Level.SEVERE,
        "Couldn't start server: " + ex.getMessage(),
        ex
      );
    }
  }

  private static void handleConnection(Socket connection) {
    try {
      Date now = new Date();
      auditLogger.info(now + " " + connection.getRemoteSocketAddress());

      OutputStream outputStream = connection.getOutputStream();
      PrintWriter out = new PrintWriter(
        new OutputStreamWriter(outputStream),
        true
      );
      out.println(now.toString());

      connection.close();
    } catch (IOException ex) {
      // client disconnected; ignore;
    }
  }
}
