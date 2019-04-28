/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bothserverclient;

/**
 *
 * @author jainil
 */
import java.io.*;
import java.net.*;
import java.net.Socket;

public class Bothserverclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
      
        Socket s=new Socket("localhost",3333);
        DataInputStream dataInputStream = new DataInputStream(s.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="";
        while(!str.equals("stop"))
        {
            str=br.readLine();
            dataOutputStream.writeUTF(str);
             dataOutputStream.flush();
            str2=dataInputStream.readUTF();
            System.out.println("SERVER says: "+str2);
        }
        dataOutputStream.close();
        dataInputStream.close();
        s.close();
       
    }
    
}
