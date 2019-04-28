package javaapplication70;
import java.util.Scanner;
import java.util.StringTokenizer;
class term
{
   
    public float coef;
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
     void getdata(int b[]) {

        for (int i = d; i >= 0; i--) {
          
            t[i].coef =  b[i];
        }
    }
    String putdata()
    {
        String c="";
        for(int i= d;i>=0;i--)
        {
           c=c+this.t[i].coef+"x^"+ i;

            if(i>0)
            {
                c=c+" + ";
            }
        }
        return c;
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
        for(int i=q;i>=q-p2.d-1;i--)
        {
            p3.t[i].coef= t[i].coef;
        }
    for(int i=p2.d;i>=0;i--)
    {
        p3.t[i].coef= t[i].coef+p2.t[i].coef;
    }
    }
    else
    {
       for(int i=q;i>=d;i--)
        {
                    p3.t[i].coef=p2.t[i].coef;
        }
        for(int i=d;i>=0;i--)
        {
            p3.t[i].coef= t[i].coef+p2.t[i].coef;
        }
    }
    return p3;
}

    polynomial sub(polynomial p2)
    {
    int q;
    if(d>p2.d)
    {
        q=d;
    }
    else
    {
        q=p2.d;
    }
    polynomial p3=new polynomial(q);
    if( d>p2.d)
    {
        for(int i=q;i>=q-p2.d-1;i--)
        {
            p3.t[i].coef= t[i].coef;
        }
    for(int i=p2.d;i>=0;i--)
    {
        p3.t[i].coef= t[i].coef-p2.t[i].coef;
    }
    }
    else
    {
       for(int i=q;i>=d;i--)
        {
                    p3.t[i].coef=p2.t[i].coef;
        }
        for(int i=d;i>=0;i--)
        {
            p3.t[i].coef= t[i].coef-p2.t[i].coef;
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

polynomial div1(polynomial p2)
{
    polynomial p3=new polynomial(p2.d-d);
       int i=p2.d;
    for(int j=p2.d-d+1;j>0;j--)
    {
        float f=p2.t[i].coef/t[d].coef;
        p3.t[j-1].coef=f;        
        i--;
    }
    return p3;
}
}


public class JavaApplication70 {

    public static void main(String[] args) {
          String a;
        String b;
        Scanner sc = new Scanner(System.in);

        a =sc.nextLine();
        b =sc.nextLine();
        StringTokenizer tt = new StringTokenizer(a);
        StringTokenizer ttt = new StringTokenizer(b);
        int dd = tt.countTokens();
        int ee = ttt.countTokens();
        int f[] = new int[dd];
        int g[] = new int[ee];
        int i = tt.countTokens()-1;
        while (tt.hasMoreTokens()) {
            f[i] = Integer.parseInt(tt.nextToken());
            i--;
        }
        i = ttt.countTokens()-1;
        while (ttt.hasMoreTokens()) {
            g[i] = Integer.parseInt(ttt.nextToken());
            i--;
        }
       
        polynomial p1 = new polynomial(dd - 1);
        polynomial p2 = new polynomial(ee - 1);
        p1.getdata(f);
        p2.getdata(g);
        polynomial p3 = p1.div(p2);
        System.out.println(p3.putdata());
       
    }
    
}
