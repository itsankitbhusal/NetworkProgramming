import java.io.*;
import java.net.*;
public class HttpHeader {
    public static void main(String[] args) {
        for (int i =0; i< args.length; i++){
            try {
                URL u = new URL (args[i]);
                URLConnection uc = u.openConnection();

                for (int j=1; ; j++){
                    String header = uc.getHeaderField(j);
                    if (header== null) break;
                    System.out.println(uc.getHeaderFieldKey(j)+ " : "+ header);
                }

            }catch (MalformedURLException ex){
                System.out.println("URL malformed Exception: "+ex);
            }catch (IOException ioe){
                System.out.println("IO Exception: "+ ioe);
            }
        }
    }
}
