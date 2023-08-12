import java.io.*;
import java.net.*;

public class UriEncoder {

  public static void main(String[] args) {
    try {
      System.out.println(URLEncoder.encode("The string has spaces ", "UTF-8"));
      System.out.println(
        URLEncoder.encode("The*string*has*asterisks", "UTF-8")
      );
      System.out.println(
        URLEncoder.encode("The%string%has%percent%signs", "UTF-8")
      );
      System.out.println(URLEncoder.encode("The+string+has+pluses ", "UTF-8"));
      System.out.println(URLEncoder.encode("The/string/has/slashes ", "UTF-8"));
      System.out.println(
        URLEncoder.encode("The\"string\" has\" quote\"marks", "UTF-8")
      );
      System.out.println(URLEncoder.encode("The:string:has:colons ", "UTF-8"));
      System.out.println(URLEncoder.encode("The~string~has~tiles ", "UTF-8"));
      System.out.println(
        URLEncoder.encode("The(string)has(parentheses) ", "UTF-8")
      );
      System.out.println(URLEncoder.encode("The.string.has.periods ", "UTF-8"));
      System.out.println(
        URLEncoder.encode("The=string=has=equals=signs ", "UTF-8")
      );
      System.out.println(
        URLEncoder.encode("The&string&has&ampersands ", "UTF-8")
      );
      System.out.println(
        URLEncoder.encode("Theéstringéhasé non-ASCII characters ", "UTF-8")
      );
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
