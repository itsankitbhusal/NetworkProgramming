import java.net.*;

public class GetLocalIp {
    public static void main(String[] args) {
        try {
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println(localAddress.getHostName());
            System.out.println(localAddress.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Exception occurs:" + e);
        }
    }
}
