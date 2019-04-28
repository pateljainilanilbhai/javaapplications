/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fille;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jainil
 */
public class Fille {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("binaryfile.txt");
        Scanner sc = new Scanner(System.in);
        try{
        if(!f.exists())
        {   f.createNewFile();  } 
            FileOutputStream fos = new FileOutputStream(f);
            int i;
            System.out.println("WRITE A BINARY FILE type exit to end");
            String j=new String("");
            j=sc.nextLine();
            while(j.compareTo("exit")!=0){
                fos.write((j+"\n").getBytes());
               j=sc.nextLine();
            }
            FileInputStream fis = new FileInputStream(f);
            System.out.println("\n\nREAD A BINARY FILE");
            while((i=fis.read())!=-1)
            {
                
                System.out.print((char)i);
                fos.write(i);
            } 
            
            
            
            
            fos.close();
            fis.close();
        }catch (IOException ex) {
                System.out.println(ex);
            }
        
        
                
                File f2 = new File("characterfile.txt");
        try {
            System.out.println("\n\nWRITTING A TEXT FILE:TYPE exit TO EXIT");
            BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(f2));
            String s;
            s=sc.nextLine();
            while(s.compareTo("exit")!=0)
                {
            bufferedWriter.write(s);
            s=sc.nextLine();
            bufferedWriter.newLine();
                }
            bufferedWriter.close();
            String line = null;
        System.out.println("\n\nREADING A TEXT FILE");
         BufferedReader bufferedReader =new BufferedReader(new FileReader(f2));
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);}   
                bufferedReader.close();    
        }
        
        catch(Exception ex) {
        }    
        
        
        //copying binary file
        System.out.println("COPYING BINARY FILE");
       try{ 
              FileInputStream in = new FileInputStream(new File("binaryfile.txt"));
      File f1=new File("destnbinaryfile.txt");
      if(f1.exists()!=true)
      {
          f1.createNewFile();
      }
      FileOutputStream out = new FileOutputStream(new File("destnbinaryfile.txt"));
      
      byte[] buf = new byte[1];
      int len;
      
      while ((len = in.read(buf))!=-1) {
         out.write(buf, 0, len);
      }
      in.close();
      out.close();
      BufferedReader in1 = new BufferedReader(new FileReader("destnbinaryfile.txt"));
      String str;
      
      while ((str = in1.readLine()) != null) {
         System.out.println(str);
      }
      in.close();
       }
       catch (Exception ex) {
            
        }
        
    }
}
    

