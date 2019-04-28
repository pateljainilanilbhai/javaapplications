/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapp;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author jainil
 */
public class linkedHashmapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
        TreeMap<Integer,String> h = new TreeMap<Integer,String>(); int id; String name; String old; int choice=1; int a,b,c; 
        Scanner sc = new Scanner(System.in);
        while(choice!=0)
        {
            System.out.println("0.exit");
            System.out.println("1.to add id and name");
            System.out.println("2.to remove a key");
            System.out.println("3.to print map");
            System.out.println("4.is key contained?");
            System.out.println("5.is value present or not?");
            System.out.println("6.to get value by key");
            System.out.println("7.to replace value by key");
            System.out.println("8.to replace value by key and old value");
            System.out.println("9.printing all keys");
            System.out.println("10.printing all values");
            System.out.println("11.printing by entry set");
            System.out.println("12.clear the map");
            System.out.println("13.print treemap key in dessending order");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    
                    System.out.println("enter id");
                    id=sc.nextInt();
                    System.out.println("enter name");
                    name=sc.next();
                    h.put(id, name);
                    break;
                case 2:
                    System.out.println("enter key to remove");
                    a=sc.nextInt();
                    if(h.containsKey(a))
                    h.remove(a);
                    break;
                case 3:
                    System.out.println(h);
                    break;
                case 4:
                    System.out.println("enter key to search");
                    a=sc.nextInt();
                    if(h.containsKey(a))
                    {
                        System.out.println("key found");
                    }
                    else
                    {
                        System.out.println("key not found");
                    }
                    break;
                case 5:
                    System.out.println("enter value to search");
                    name=sc.next();
                    if(h.containsValue(name))
                    {
                        System.out.println("value found");
                    }
                    else
                    {
                        System.out.println("value not found");
                    }
                    break;
                case 6:
                    System.out.println("enter key to search");
                    a=sc.nextInt();
                    if(h.containsKey(a)){
                    name=h.get(a);
                    System.out.println(name);
                    }
                    else
                    {
                        System.out.println("key not found");
                    }
                    break;
                case 7:
                    System.out.println("enter key to replace value");
                    a=sc.nextInt();
                    if(h.containsKey(a))
                    {
                        System.out.println("older value is "+h.get(a));
                        System.out.println("enter new value");
                        name=sc.next();
                        h.replace(a, name);
                    }
                    else
                    {
                        System.out.println("key not found");
                    }
                    break;
                case 8:
                    System.out.println("enter key");
                    a=sc.nextInt();
                    System.out.println("enter old value");
                    old=sc.next();
                    if(h.containsKey(a))
                    {
                        System.out.println("enter new value");
                        name=sc.next();
                        h.replace(a, old, name);
                    }
                    else
                    {
                        System.out.println("key not present");
                    }
                    break;
                case 9:
                    for (Integer integer : h.keySet()) {
                        System.out.println(integer+" ");                        
                    }
                    break;
                case 10:
                    for (String value : h.values()) {
                        System.out.println(value);
                                            }
                    break;
                case 11:
                    for (Map.Entry<Integer, String> entry : h.entrySet()) {
                        System.out.println(entry.getKey()+"   "+entry.getValue());
                    }           
                    break;
                case 12:
                    h.clear();
                    break;
                case 13:
                    for (Integer integer : h.descendingKeySet()) {
                        System.out.println(integer);
                    }
                    break;
                default:
                    System.out.println("enter correct choice please");
            }
            
        }
        
    }
    
}
