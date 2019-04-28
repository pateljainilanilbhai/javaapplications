/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author jainil
 */
public class Clients {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Socket s=new Socket("172.20.10.9",3000);
         BufferedReader cin=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream cout=new PrintStream(s.getOutputStream());
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
         String str;
         while(true)
         {
             System.out.println("Client:");
             str=input.readLine();
             if(str.equals("bye"))
             {
                 break;
             }
             cout.println(str);
             System.out.println("Server:");
             str=cin.readLine();
             if(str.equals("end"))
             {
                 break;
             }
             System.out.println(str);
             
             
         }
    }
    
}
