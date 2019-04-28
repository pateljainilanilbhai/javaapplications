/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class NewClass {
    public static void main(String[] args) throws IOException {
        Socket s1 = new Socket("localhost",1254);
    InputStream s1In=s1.getInputStream();
    DataInputStream dis=new DataInputStream(s1In);
    DataOutputStream dos=new DataOutputStream(s1.getOutputStream());
    while(true){
    String st=new String (dis.readUTF());
        System.out.println(st);
        Scanner sc=new Scanner(System.in);
            
        dos.writeUTF(sc.nextLine());
    }
        
    }
    
}
