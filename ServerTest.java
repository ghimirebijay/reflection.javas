import java.net.*;
import java.util.Date;
import java.io.*;

public class ServerTest {
    public static void main(String[] args) {
        try {
        ServerSocket ss = new ServerSocket(8000);
        while(true) {
        Socket clientSocket = ss.accept();
        System.out.println("Client has connected!!!");
        DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
        DataInputStream in = new DataInputStream(clientSocket.getInputStream());
        System.out.println("Client said:");
        while(in.available() > 0) {
            byte[] msg = in.readNBytes(in.available());
            for(byte b: msg) {
                System.out.print((char) b);
            }
        }

        out.writeUTF(new Date().toString());
        out.flush();
        clientSocket.shutdownOutput();

        clientSocket.close(); 
    }

        } catch (Exception e) {System.out.println(e);}
    }
}