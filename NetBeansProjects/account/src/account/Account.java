/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import static java.lang.System.exit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    static int count=0;
    private int id=0;
    private double balance=0;
    private double annualInterestRate=7;
    private Date dateCreated=new Date();
    
    Account()
    {
        id=count;
        balance=0;
        annualInterestRate=7;
   count++;
        
        
    }
    Account (int idd,double balancee)
    {
        id=idd;
        balance=balancee;
        
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Account.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

Scanner sc=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter id");
        id=sc.nextInt();
        System.out.println("enter balance");
        balance=sc.nextDouble();
        System.out.println("enter rate");
        annualInterestRate=sc.nextDouble();
    }
    void printdata()
    {
        System.out.println("id:"+id+" \n"+"balance:"+balance+" \n"+"annual interest rate"+annualInterestRate);
        
        System.out.println("date:"+dateCreated.getDate()+" "+(dateCreated.getMonth()+1)+" "+(dateCreated.getYear()+1900));
    }
    void printdate()
    {
        System.out.println("date"+dateCreated.getDate()+" "+(dateCreated.getMonth()+1)+" "+(dateCreated.getYear()+1900));
    }
    void withdraw(double a)
    {
        balance=balance-a;
    }
    void deposit(double a)
    {
        balance=balance+a;
    }
    double getMonthlyInterestRate()
    {
        System.out.println("Monthly interest rate is");
        return annualInterestRate/12;
    }
    double getMonthlyInterest()
    {
        double c=balance*annualInterestRate*(1.0/12.0)*0.01;
        return c;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account a[]=new Account[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=new Account();
            
        }
        aa:
        while (true) {
            
            System.out.println("total account in bank are 10");
        System.out.println("1.for inserting balance");
        System.out.println("2.for withrawing balance");
        System.out.println("3.for balance sheet");
        System.out.println("4.for new explicit registration");
        System.out.println("5.fot rate change");
        System.out.println("6.for monthly rate");
        System.out.println("7.to end");
        int choice;
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        switch (choice) {
            case 1:
            {int x;
                System.out.println("enter id");
                x=sc.nextInt();
                System.out.println("enter inserting balance");
                float y;
                y=sc.nextInt();
                a[x].balance=a[x].balance+y;
                break;}
            case 2:
                {int x;
                System.out.println("enter id");
                x=sc.nextInt();
                System.out.println("enter withdrawing balance");
                float y;
                y=sc.nextInt();
                a[x].balance=a[x].balance-y;
                break;}
            case 3:
            {
                int x;
                System.out.println("enter id");
                x=sc.nextInt();
                a[x].printdata();
                break;
            }
            case 4:
            {
                Account acc = new Account();
                acc.getdata();
                acc.printdata();break;
            }
            case 5:
            {
                int x;
                System.out.println("enter id");
                x=sc.nextInt();
                 System.out.println("enter rate");
                float y;
                y=sc.nextInt();
                a[x].annualInterestRate=y;break;
            }
            case 6:
            {
                 int x;
                System.out.println("enter id");
                x=sc.nextInt();
                System.out.println(a[x].getMonthlyInterest());break;
            }
            case 7:
            {
                break aa;
            }
            default:
                throw new AssertionError();
        }
       
      
    }
    
    
}
}
