import java.io.*;
import java.net.*;
public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3333);

        Socket s = ss.accept(); // It establishes the connection to client and wait until request for connection arrival

        DataInputStream din = new DataInputStream(s.getInputStream());

        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "", str2 = "";

        while (!str1.equals("stop")){
            str1 = din.readUTF();
            System.out.println("Client: "+ str1);

            str2 = br.readLine();

            dout.writeUTF(str2);

            dout.flush();
        }
        din.close(); dout.close(); s.close(); ss.close();

    }
}
