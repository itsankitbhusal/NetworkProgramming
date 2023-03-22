import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            String host = "";
            System.out.println("Enter the domain name: ");
            host = input.nextLine();

            InetAddress address = InetAddress.getByName(host);

//            System.out.println(address.getHostAddress());

//            String ip = address.getHostAddress();

            System.out.println(address.getCanonicalHostName());
            System.out.println(address.getHostName());

//             error
//            byte[] ipaddress = address.getAddress();
//            for (int i = 0; i < ipaddress.length; i++) {
//                System.out.println(ipaddress[i]);
//            }
        } catch (UnknownHostException e) {
            System.out.println("Unable to find: " + e);
        }
    }
}