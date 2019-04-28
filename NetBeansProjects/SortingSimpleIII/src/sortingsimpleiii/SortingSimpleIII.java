package sortingsimpleiii;

import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class SortingSimpleIII
{

    public static <T extends Comparable<T>> void bubblesort(T[] elements)
    {
        for(int i=0;i<elements.length;i++)
            for(int j=0;j<i;j++)
            {
                if(elements[i].compareTo(elements[j])==-1)
                {
                T temp=elements[i];
                elements[i]=elements[j];
                elements[j]=temp;
                }
            }
    }   
    
    public static void main(String[] args) {        
        int n;
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("\nhow many Bytes you wanted to sort");
        n=sc.nextInt();
        Byte a[]=new Byte[n];
        
        System.out.println("enter "+n+" bytes ");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextByte();
        }
        bubblesort(a);
        for (Byte byte1 : a) {
            System.out.print(byte1+" ");
        }
        
        
        System.out.println("\nhow many Float you wanted to sort");
        n=sc.nextInt();
        Float aa[]=new Float[n];
        System.out.println("enter "+n+" Float ");
        for (int i = 0; i < n; i++) {
            aa[i]=sc.nextFloat();
        }
        bubblesort(aa);
        for (Float fl : aa) {
            System.out.print(fl+" ");
        }
        
        
         System.out.println("\nhow many Integer you wanted to sort");
        n=sc.nextInt();
        Integer aaa[]=new Integer[n];
        System.out.println("enter "+n+" Integer ");
        for (int i = 0; i < n; i++) {
            aaa[i]=sc.nextInt();
        }
        bubblesort(aaa);
        for (Integer byte1 : aaa) {
            System.out.print(byte1+" ");
        }              
    }   
}
