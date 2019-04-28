/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.*;

public class Filee {
   public static void main(String[] args) throws Exception {
      FileInputStream in = new FileInputStream(new File("srcfile.txt"));
      File f1=new File("destnfile.txt");
      if(f1.exists()!=true)
      {
          f1.createNewFile();
      }
      FileOutputStream out = new FileOutputStream(new File("destnfile.txt"));
      
      byte[] buf = new byte[1024];
      int len;
      
      while ((len = in.read(buf)) > 0) {
         out.write(buf, 0, len);
      }
      in.close();
      out.close();
      BufferedReader in1 = new BufferedReader(new FileReader("destnfile.txt"));
      String str;
      
      while ((str = in1.readLine()) != null) {
         System.out.println(str);
      }
      in.close();
   }
}