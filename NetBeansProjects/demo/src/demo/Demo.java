/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import static java.lang.System.exit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jainil
 */
 class Account {

    /**
     * @param args the command line arguments
     */
    static int count=0;
    private int id=0;
    private double balance=0;
    private double annualInterestRate=7;
    private Date dateCreated=new Date();
    private int limit=0;

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
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
         if(balance<limit)
                {
                    System.out.println("Limit exceeded sorry");
                    balance=balance+a;
                }
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
    
    
    
}

class SavingAccount extends Account
{
    
}
class CheckingAccount extends Account
{
    
}
public class Demo
{
    public static void main(String[] args) {
     
        // TODO code application logic here
        System.out.println("Saving account");
     SavingAccount a=new SavingAccount();
     a.getdata();
     
        System.out.println("enter withdawing amount");
        double q;
        Scanner sc = new Scanner(System.in);
        q=sc.nextInt();
        a.withdraw(q);
        a.printdata();
        System.out.println("monthly rate"+a.getMonthlyInterest());
        System.out.println("checking account");
        CheckingAccount b=new CheckingAccount();
        
        b.getdata();
        System.out.println("enter withdawing amount");
        double w;
        b.setLimit(-5000);
        w=sc.nextInt();
        b.withdraw(w);
        b.printdata();
        System.out.println("monthly rate"+b.getMonthlyInterest()+" "+b.getLimit());
        
        
    }
}


