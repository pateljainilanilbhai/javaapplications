package word;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author jainil
 */
public class Word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        StringTokenizer s = new StringTokenizer(str);
        int count=s.countTokens();
        String k[]=new String[s.countTokens()];
        int i=0;
      while(s.countTokens()!=0)
        {
            k[i]=s.nextToken();
            i++;
        }
        System.out.println("SORTING USING TREESET ");
      //SORTING USING TREESET   
      TreeSet<String> treeset =new TreeSet<String>();
        for (int j = 0; j < count; j++) {
            treeset.add(k[j]);            
        }
        
        for (String string : treeset) {
            System.out.println(string);
        }
        System.out.println("SORTING USING TREEMAP");
        //SORTING USING TREEMAP
        TreeMap<String,Integer> treemap = new TreeMap<String,Integer>();
        
        for (int j = 0; j < count; j++) {
            treemap.put(k[j],j);            
        }
        for(Map.Entry<String,Integer> en:treemap.entrySet())
        {
            System.out.println(en.getValue()+"->"+en.getKey());
        }
        /*
        TREE MAP METHODS
        TreeMap<String,Integer> t = new TreeMap<String,Integer>();    INITIALIZATION OF MAP WITH KEY( STRINGS )AND VALUE( INTEGER)
        t.put(key,value);
        t.containsKey(key);
        t.keySet();      returns array of keys
        t.values();        returns array of values
        t.get(key);       returns value stored in key
        t.remove(key);      removes one key and one value
        t.size();
        t.clear();
        t.isEmpty();
        t.entryset();     returns   Map.Entry<key,value>[]
        Entry class contains .getKey() and .getValues() Functions to get data
        */      
    }
    
}
