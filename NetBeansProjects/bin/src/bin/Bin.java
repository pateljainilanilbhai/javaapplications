/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Bin extends Thread implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
       
        try{
            File f=new File("abc.txt");
            if(!f.exists())
            {
                f.createNewFile();
            }
        FileInputStream fin=new FileInputStream("abc.txt");
        FileOutputStream fout=new FileOutputStream("abc.txt");
   
        Scanner sc=new Scanner(System.in);
        String a="";
        a=sc.nextLine();
          
        while(a.compareTo("exit")!=0)
        {
            fout.write(a.getBytes());
            fout.write("\n".getBytes());
            a=sc.nextLine();
        }
        int i;
        while((i=fin.read())!=-1)
        {
            System.out.print((char)i);
        }
        
        }
        catch (Exception ex) {
            
        }
        
    }
    
}
