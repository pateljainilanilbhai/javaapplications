package assi;
import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Assi {
    public static void bubblesort(char [] elements)
    {
        for(int i=0;i<elements.length;i++)
            for(int j=0;j<i;j++)
            {
                if(elements[i]<elements[j])
                {
                char temp=elements[i];
                elements[i]=elements[j];
                elements[j]=temp;
                }
            }
    }   
    static boolean ana(String a,String b)
    {
        if(a.length()==b.length()){
            char c[]=a.toCharArray();
            char d[]=b.toCharArray();
             bubblesort(c);
             bubblesort(d);
             boolean flag=true;
             for(int i=0;i<a.length()&&flag==true;i++)
             {
                 if(c[i]!=d[i])
                 {
                     flag=false;
                 }
             }
             if(flag)
             {
                 return true;
             }
             else
             {
                 return false;
             }
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String a=sc.next();
        System.out.println("enter second string");
        String b=sc.next();
        if(ana(a,b))
        {
            System.out.println("ANAGRAM STRINGS");
        }
        else
        {
            System.out.println("not anagram");
        }
    }
    
}
