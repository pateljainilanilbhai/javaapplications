/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author jainil
 */
class Q
{
    int n;
    boolean canget=false;
    synchronized int get()
    {
        if(!canget)
        {
            try{
                wait(1000);
            }catch (Exception ex) {    }
            
        }
        System.out.println("got"+n);
        canget=false;
        notify();
        return n;
    }
    synchronized void put(int n)
    {
        if(canget)
        {
            try{
                wait(1000);
            }catch (Exception ex) {    }
            
        }
        this.n=n;
        System.out.println("put"+n);
        canget=true;
        notify();      
    }
}
class producer extends Thread
{
    Q q;
    producer(Q q)
    {
        this.q=q;
        this.start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            q.put(i++);
        }
    }
}

class consumer extends Thread
{
    Q q;
    consumer(Q q)
    {
        this.q=q;
        this.start();
    }
    public void run()
    {
        
        while(true)
        {
            q.get();
        }
    }
}
public class PC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Q q=new Q();
        new producer(q);
        new consumer(q);
    }
    
}
