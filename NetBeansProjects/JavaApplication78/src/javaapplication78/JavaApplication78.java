/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;

import java.io.*;

/**
 *
 * @author jainil
 */
public class JavaApplication78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        FileInputStream fin=new FileInputStream("Hi.txt");
        File f=new File("abc.txt");
        if(!f.exists())
        {
            f.createNewFile();
        }
        FileOutputStream fout=new FileOutputStream(f);
        int i;
        while((i=fin.read())>0)
        {
            fout.write(i);
        }
        BufferedReader b=new BufferedReader(new FileReader(f)) ;
        String s;
        while((s=b.readLine())!=null)
        {
            System.out.println(s);
        }
        }
        catch(Exception e)
        {
            
        }
    }
    
}
