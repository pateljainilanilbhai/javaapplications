package javaapplication75;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class JavaApplication75 {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket s = new ServerSocket(1254);
        Socket s1=s.accept();
          InputStream s1In=s1.getInputStream();
    DataInputStream dis=new DataInputStream(s1In);
        DataOutputStream dos=new DataOutputStream(s1.getOutputStream());
        while(true){
            Scanner sc=new Scanner(System.in);
                    dos.writeUTF(sc.nextLine());
                     String st=new String (dis.readUTF());
        System.out.println(st);
        }        
    }    
}
