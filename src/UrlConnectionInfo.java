import java.io.*;
import java.net.*;
import java.util.*;

public class UrlConnectionInfo {

  public static void main(String[] args) {
    try {
      URL u = new URL("http://www.ankitbhusal.com.np");
      URLConnection uc = u.openConnection();
      System.out.println("Content-type: " + uc.getContentType());
      System.out.println("Content-encoding: " + uc.getContentEncoding());
      System.out.println("Date: " + new Date(uc.getDate()));

      System.out.println("Last modified: " + new Date(uc.getLastModified()));

      System.out.println("Expiration date: " + new Date(uc.getExpiration()));

      System.out.println("Content-length: " + uc.getContentLength());
    } catch (Exception ex) {
      System.err.println("exception: " + ex);
    }
  }
}
