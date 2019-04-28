/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sjf;

import java.util.Scanner;

/**
 *
 * @author jainil
 */


class process
{
    
    public int processid;
    public int arrivaltime;
    public int bursttime;
    public int completiontime;
    public int turnaroundtime;
    public int waitingtime;

    public process(int processid, int arrivaltime, int bursttime) {
        this.processid = processid;
        this.arrivaltime = arrivaltime;
        this.bursttime = bursttime;
    }

    public process() {
    }
    
    
}

public class Sjf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("enter no of process");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        process p[]=new process[n];
        
        System.out.println("enter details of process");
        for(int i=0;i<n;i++)
        {
            int processid=i;
            int arrivaltime;
            int bursttime;
            System.out.println("enter arrival time of process "+i);
            arrivaltime=sc.nextInt();
            System.out.println("enter bursttime of process "+i);
            bursttime=sc.nextInt();
            p[i]=new process(processid,arrivaltime,bursttime);
        }
        int currenttime=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if((p[i].arrivaltime<=currenttime)&&(p[j].bursttime<p[i].bursttime))
                {
                    process temp=new process();
                    temp=p[i];
                    p[i]=p[j];
                    p[j]=temp;
                }
            }
            
            while(p[i].arrivaltime>currenttime)
            {
                currenttime++;
            }
            currenttime=currenttime+p[i].bursttime;
            System.out.println("process "+p[i].processid+" completed at "+currenttime);
            
        }
        
        
    }
    
}
