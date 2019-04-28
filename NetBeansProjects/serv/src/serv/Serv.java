/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;
import java.io.*;
import java.net.*;

/**
 *
 * @author jainil
 */
public class Serv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=dis.readUTF();
            System.out.println(str);
            dis.close();
        }
        catch (Exception ex) {
            System.out.println(ex);
            
        }
        
    }
    
}
