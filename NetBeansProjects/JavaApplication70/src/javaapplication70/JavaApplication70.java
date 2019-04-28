package javaapplication70;
import java.util.Scanner;
import java.util.StringTokenizer;
class term
{
   
    public int coef;
    public int exp;
     term sum(term t2)
    {
        term t3=new term();
        t3.coef= coef+t2.coef;
        return t3;
    }
    term sub(term t2)
    {
        term t3=new term();
        t3.coef= coef-t2.coef;
        return t3;
    }
    term mul(term t2)
    {
        term t3=new term();
        t3.coef= coef*t2.coef;
        t3.exp= exp+t2.exp;
        return t3;
    }
}
class polynomial
{

    public int d;
   public term t[];

    polynomial(int s)
    {
        d=s;
        
         t=new term[d+1];
        for(int i=s;i>=0;i--)
        {
            t[i]=new term();
             t[i].exp=i;
             t[i].coef=0;            
        }
    }
    void getdata()
    {
        System.out.println("enter coefficients");
        Scanner sc=new Scanner(System.in);
         for(int i= d;i>=0;i--)
        {
            int a;
            a=sc.nextInt();
             t[i].coef=a;              
        }
    }
    void putdata()
    {
        for(int i= d;i>=0;i--)
        {
            System.out.print( t[i].coef+"x^"+ i);
            
            if(i>0)
            {
                System.out.print(" + ");;
            }
        }
    }
    polynomial sum(polynomial p2)
    {
    int q;
    if( d>p2.d)
    {
        q= d;
    }
    else
    {
        q=p2.d;
    }
    polynomial p3=new polynomial(q);
    if( d>p2.d)
    {
        for(int i=q;i>=q-p2.d;i--)
        {
            p3.t[i].coef= t[i].coef;
        }
    for(int i=q-p2.d-1;i>=0;i--)
    {
        p3.t[i].coef= t[i].coef+p2.t[i].coef;
    }
    }
    else
    {
       for(int i=q;i>=p2.d-q;i--)
        {
                    p3.t[i].coef=p2.t[i].coef;
        }
        for(int i=p2.d-q+2;i>=0;i--)
        {
            p3.t[i].coef= t[i].coef+p2.t[i].coef;
        }
    }
    return p3;
}


polynomial mul(polynomial p2)
{
    int x;
    x= d+p2.d;
    polynomial p3=new polynomial(x);
    for(int i= d;i>=0;i--)
    {
        for(int j=p2.d;j>=0;j--)
        {
            p3.t[i+j]=p3.t[i+j].sum( t[i].mul(p2.t[j]));
        }
       
    }
    return p3;
}
}


public class JavaApplication70 {

    public static void main(String[] args) {
         int d;
         System.out.println("for p1 enter degree:");
Scanner sc = new Scanner(System.in);
    d=sc.nextInt();
    polynomial p1=new polynomial(d);
    p1.getdata();
      System.out.println("for p2 enter degree:");
   
    d=sc.nextInt();
    polynomial p2=new polynomial(d);
    p2.getdata();
      int x;
    x=d+p2.d;
    polynomial p3=new polynomial(x);
    p3=p1.mul(p2);   
      p3.putdata();
    }
    
}
