/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

/**
 *
 * @author jainil
 */
class Jav {

    static  int N;
    static int lef = -1, righ = 1, dow = N, u = -N;
    static int next(int dir)
    {
        if(dir==lef)
        {return u;}
        else if(dir==u)
        {return righ;}
        else if(dir==righ)
        {return dow;}
        else if(dir==dow)
        {return lef;}
        return 0;
    }

    static void fill(int grid[])
    {
        int pos = 0, dir = u;
        for (int i = 1; i <= N*N; i++)
        {
            grid[pos] = i;
            if (pos == 0 || pos == N - 1 || pos == N*(N - 1) || pos == N*N - 1 || grid[pos + dir] != 0)
            {
                dir = next(dir);
            }
            pos += dir;
        }
    }
    String disp(int k)
    {

        N=k;
        u=-N; dow=N;
        int a[]=new int[N*N];
        for(int i=0;i<N*N;i++)
        {a[i]=0;}
        fill(a);
        String str="";


        for(int i=0;i<=(N*N)-1;i++)
        {
            if(i%N==0&&i!=0)
            {
                str=str+"\n";
            }
            str=str+a[i]+" ";
        }
        return str;

    }

}
public class JavaApplication72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jav a=new Jav();
       
        System.out.println(a.disp(10));
    }
    
}
