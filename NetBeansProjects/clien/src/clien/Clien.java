/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clien;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Clien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
            Socket ss=new Socket("localhost",6666);
            
             DataOutputStream dataOutputStream = new DataOutputStream(ss.getOutputStream());
             Scanner sc=new Scanner(System.in);
             String str=sc.nextLine();
            dataOutputStream.writeUTF(str);
            dataOutputStream.close();
        }
        catch (Exception ex) {
            System.out.println(ex);
            
        }
    }
    
}
