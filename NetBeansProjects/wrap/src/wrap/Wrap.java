package wrap;

/**
 *
 * @author jainil
 */
public class Wrap {

    public static void main(String[] args) {
        // TODO code application logic here
        Integer a=new Integer(20);
        System.out.println(a);
        
        int i=a;
        System.out.println(i);
        
        int j=a.intValue();
        byte b=a.byteValue();
        float f=a.floatValue();
        short s=a.shortValue();
        long l=a.longValue();
        System.out.println(j);
        System.out.println(b);
        System.out.println(f);
        System.out.println(s);
        System.out.println(l);
        
        
        String str=a.toString();
        System.out.println(str);
        
        
        Integer n=Integer.valueOf(str);
        System.out.println(n);
        
        
        int c=Integer.parseInt(str);
        System.out.println(c);
    }
    
}
