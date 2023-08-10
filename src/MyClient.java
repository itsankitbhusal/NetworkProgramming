import java.io.*;
import java.net.*;
public class MyClient  {
    public static void main(String[] args)throws IOException, Exception {
        Socket s =new Socket("localhost", 3333);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = "";
        String str2 = "";

        while(!str2.equals("stop")){
            str1 = br.readLine();
            dout.writeUTF(str1);
            dout.flush();

            str2 = din.readUTF();
            System.out.println("Server says: "+ str2);


        }
        din.close(); dout.close(); s.close();
    }
}
