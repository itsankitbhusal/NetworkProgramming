import java.net.InetAddress;

public class IsReachableTime {
    public static void main(String[] args) {

        try {
            InetAddress add = InetAddress.getByName("www.google.com");
            System.out.println(add);
            if (add.isReachable(10000)) {
                System.out.println("Reachable");
            } else {
                System.out.println("Not reachable");
            }

        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }
}
