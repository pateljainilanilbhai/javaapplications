/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keywords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author jainil
 */
public class Keywords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s[]={"abstract","assert","boolean","break","byte","case","catch","char","class","continue","default","do","double","else","enum","extends","final","finally","float","for","if","implements","import","instanceof","int","interface","long","native","new,package","private","protected","public","return","short","static","super","switch","synchronized","this","throw","throws","transient","try","void","volatile","while"};
    HashSet<String> h=new HashSet<String>();    
        for (String string : s) {
            h.add(string);
        }
        String a;
        int count=0;
        System.out.println("ENTER FILE PATH:");
         Scanner sc = new Scanner(System.in);
        a=sc.next();
        
        File f = new File(a);
        try{
          BufferedReader bufferedReader =new BufferedReader(new FileReader(f));
            String line;
            while((line = bufferedReader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                String k[]=new String[st.countTokens()];
        int i=0;
      while(st.countTokens()!=0)
        {
            k[i]=st.nextToken();
            i++;
        }
                for (String str : k) {
                    if(h.contains(str))
                    {
                        count++;
                    }
                }
                System.out.println(line);  
                
            
            }System.out.println("number of keywords used="+count);
            bufferedReader.close();
        }
        catch (Exception ex) {
            
        }
    } 

}
