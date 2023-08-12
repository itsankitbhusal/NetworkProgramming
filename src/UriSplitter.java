import java.net.URI;

public class UriSplitter {

  public static void main(String[] args) {
    String url =
      "http://www.ankitbhusal.com.np/blog/java/uri-splitter?name=ankit&age=20#fragment";
    try {
      URI u = new URI(url);
      System.out.println("The URI is " + u);
      if (u.isOpaque()) {
        System.out.println("This is an opaque URI.");
        System.out.println("The scheme is " + u.getScheme());
        System.out.println(
          "The scheme specific part is " + u.getSchemeSpecificPart()
        );
        System.out.println("The fragment ID is " + u.getFragment());
      } else {
        System.out.println("This is a hierarchical URI.");
        System.out.println("The scheme is " + u.getScheme());
        try {
          u = u.parseServerAuthority();
          System.out.println("The host is " + u.getHost());
          System.out.println("The user info is " + u.getUserInfo());
          System.out.println("The port is " + u.getPort());
        } catch (Exception ex) {
          // Not a server authority
        }
        System.out.println("The path is " + u.getPath());
        System.out.println("The query string is " + u.getQuery());
        System.out.println("The fragment ID is " + u.getFragment());
      }
    } catch (Exception ex) {
      System.err.println(args[i] + " is not a URI Reference.");
    }
    System.out.println();
  }
}
