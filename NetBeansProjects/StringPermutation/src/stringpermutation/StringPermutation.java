/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpermutation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author jainil
 */
public class StringPermutation {

    /**
     * @param args the command line arguments
     */
    
   
    
    public void permute(char input[])
    {
        Map<Character, Integer> countMap = new TreeMap<>();
        for(char ch:input){
            countMap.compute(ch,(key,val)->{
                if(val==null)
                {
                    return 1;
                }
                else{
                    return val+1;
                }
            });
        }
        char str[]=new char[countMap.size()];
        int count[]=new int[countMap.size()];
        int index=0;
        for(Map.Entry<Character, Integer> entry:countMap.entrySet()){
            str[index]=entry.getKey();
            count[index]=entry.getValue();
            index++;
            
        }
        char result[]=new char[input.length];
        permuteUtil(str,count,result,0);
        
      
    }
    
    public void permuteUtil(char str[],int count[],char result[],int level)
    {
        if(level==result.length)
        {
            System.out.println(result);
            return;
        }
        for(int i=0;i<str.length;i++)
        {
            if(count[i]==0)
            {
                continue;
            }
            result[level]=str[i];
            count[i]--;
            permuteUtil(str,count,result,level+1);
            count[i]++;
                  
        }
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter string");
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.next();
        StringPermutation s = new StringPermutation();
        s.permute(a.toCharArray());     
        
    }
    
}
