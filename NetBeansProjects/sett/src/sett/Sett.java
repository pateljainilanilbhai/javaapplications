/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sett;

import java.util.TreeSet;

/**
 *
 * @author jainil
 */
public class Sett {

    /**
     * @param args the command line arguments
     */
    
   static TreeSet<Integer> union(TreeSet<Integer>  a,TreeSet<Integer>  b)
    {
     TreeSet<Integer> c=new TreeSet<Integer>();
        for (Integer integer : a) {
            c.add(integer);
        }
        for (Integer integer : b) {
            c.add(integer);
        }
        return c;
    }
    
   static TreeSet<Integer> intersection(TreeSet<Integer>  a,TreeSet<Integer>  b)
   {
        TreeSet<Integer> c=new TreeSet<Integer>();
        for (Integer i : a) {
            if(b.contains(i))
            {
                c.add(i);
            }
        }
            
        for (Integer i : b) {
            if(a.contains(i))
            {
                c.add(i);
            }
        }         
        return c;
   }
   
      
   static TreeSet<Integer> subtraction(TreeSet<Integer>  a,TreeSet<Integer>  b)
   {
       TreeSet<Integer> c=new TreeSet<Integer>();
       for (Integer integer : a) {
           c.add(integer);
       }
       for (Integer integer : b) {
           if(a.contains(integer))
           {
               c.remove(integer);
           }
       }
      return c;
   }
   
   static TreeSet<Integer> delta(TreeSet<Integer>  a,TreeSet<Integer>  b)
   {
       TreeSet<Integer> c=new TreeSet<Integer>();
       c=subtraction(union(a,b),intersection(a,b));
       return c;
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Integer> a=new TreeSet<Integer>();
        TreeSet<Integer> b=new TreeSet<Integer>();
        a.add(5);
        a.add(15);
        a.add(115);
        a.add(1115);
        a.add(11115);
        a.add(25);
        a.add(225);
        a.add(2225);
        a.add(22225);
        
        
        
        
        b.add(5);
        b.add(47);
        b.add(447);
        b.add(4447);
        b.add(44447);
        b.add(25);
        b.add(225);
        b.add(2227);
        b.add(22227);
        
        
        
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        TreeSet<Integer> u=new TreeSet<Integer>();
        u=union(a,b);
        System.out.println("union is "+u);
        System.out.println("");
        
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        TreeSet<Integer> i=new TreeSet<Integer>();
        u=intersection(a,b);
        System.out.println("intersection is "+u);
        System.out.println("");
        
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        TreeSet<Integer> d=new TreeSet<Integer>();
        d=subtraction(a,b);
        System.out.println("a-b subtraction is "+d);
        System.out.println("");
        
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        TreeSet<Integer> delta=new TreeSet<Integer>();
        delta=delta(a,b);
        System.out.println("a delta b is "+delta);
        System.out.println("");        
    }    
}
