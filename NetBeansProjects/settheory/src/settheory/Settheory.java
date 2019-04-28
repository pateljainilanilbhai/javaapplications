package settheory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.lang.Integer;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author jainil
 */
public class Settheory {
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;int k;
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> a = new LinkedHashSet<Integer>();
             LinkedHashSet<Integer> b = new LinkedHashSet<Integer>();
          a.add(1);
          a.add(2);
          a.add(3);
          a.add(5);
          a.add(7);
          a.add(10);
          a.add(13);
          a.add(14);
          a.add(15);
          a.add(16);
          a.add(19);
          a.add(18);
          a.add(11);
        
          
          
           b.add(1);
          b.add(22);
          b.add(31);
          b.add(52);
          b.add(77);
          b.add(104);
          b.add(135);
          b.add(142);
          b.add(151);
          b.add(16);
          b.add(19);
          b.add(18);
          b.add(11);
       //union
          LinkedHashSet<Integer> c= new LinkedHashSet<Integer>();
       
          System.out.println(c);
        
       }
}
