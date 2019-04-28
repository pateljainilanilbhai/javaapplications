/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;

/**
 *
 * @author jainil
 */
public class Server{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        ServerSocket ss=new ServerSocket(3000);
        Socket s=ss.accept();
        BufferedReader cin=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream cout=new PrintStream(s.getOutputStream());
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true)
        {
            //read
            str=cin.readLine();
            if(str.equals("bye"))
            {
                break;
            }
            System.out.println("client:"+str);
            System.out.println("server:");
            cout.println(input.readLine());
        }
        ss.close();
        s.close();
        cin.close();
        cout.close();
        input.close();
        
    }
    
}
