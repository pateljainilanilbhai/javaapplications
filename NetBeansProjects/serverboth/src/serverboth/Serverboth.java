/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverboth;
import java.io.*;
import java.net.*;
import java.net.Socket;
/**
 *
 * @author jainil
 */
public class Serverboth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
          ServerSocket ss=new ServerSocket(3333);
        Socket s=ss.accept();
         DataInputStream dataInputStream = new DataInputStream(s.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="";
        while(!str.equals("stop"))
        {
            str=dataInputStream.readUTF();
            System.out.println("client says: "+str);
            str2=br.readLine();
            dataOutputStream.writeUTF(str2);
            dataOutputStream.flush();
            
        }
        dataInputStream.close();
        s.close();
        ss.close();
    }
    
}
