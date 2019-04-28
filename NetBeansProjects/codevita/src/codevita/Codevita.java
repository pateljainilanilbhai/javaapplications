/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codevita;

import java.util.Scanner;

/**
 *
 * @author jainil
 */

public class Codevita {

    /**
     * @param args the command line arguments
     */
    String number(int a,char b)
{
    if(a==1)
    {
        
        return "one "+b;
    }
    if(a==2)
    {
        return "two "+b+"'s";
    }
    if(a==3)
    {
        return "three "+b+"'s";
    }
    if(a==4)
    {
        return "four "+b+"'s";
    }
    if(a==5)
    {
        return "five "+b+"'s";
    }
    return "null";
}
    
    int findtotal(String a,char b)
    {
        int result=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==b)
            {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int numberofresult=0;
        String result[]=new String[50];
        Scanner sc=new Scanner(System.in);
        String question;
        question=sc.nextLine();
        Codevita c=new Codevita();
        int number=question.length();
        int recc=(question.length()-1)/2+1;
        
        int dimm=recc;
        
        if(dimm==1)
        {
            char first=question.charAt(0);
           String possible[]=new String[5];
           for(int i=1;i<=5;i++)
           {
               possible[i-1]="This sentence contains "+c.number(i, first);
           }
           
            for(int i=0;i<5;i++)
            {
                if(c.findtotal(possible[i], first)==i+1)
                {
                    
                         result[numberofresult]=possible[i];
                         numberofresult++;
                }
            }
            
            
        }
        
        
         if(dimm==2)
        {
            char first=question.charAt(0);
            char second=question.charAt(2);
           String possible[][]=new String[5][5];
           for(int i=1;i<=5;i++)
           {
               for(int j=1;j<=5;j++)
               {
                   possible[i-1][j-1]="This sentence contains "+c.number(i, first)+" and "+c.number(j, second);
               }
               
           }
           
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++){
                if(c.findtotal(possible[i][j], first)==i+1&&c.findtotal(possible[i][j], second)==j+1)
                {
                    
                         result[numberofresult]=possible[i][j];
                         numberofresult++;
                         
                }
                }   
            }
        }
         
         
         
          if(dimm==3)
        {
            char first=question.charAt(0);
            char second=question.charAt(2);
            char third=question.charAt(4);
           String possible[][][]=new String[5][5][5];
           for(int i=1;i<=5;i++)
           {
               for(int j=1;j<=5;j++)
               {
                   for(int k=1;k<=5;k++)
                   {
                   possible[i-1][j-1][k-1]="This sentence contains "+c.number(i, first)+" and "+c.number(j, second)+" and "+c.number(k, third);
                   }
               }
               
           }
           
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++){
                    
                    for(int k=0;k<5;k++)
                   {
                        if(c.findtotal(possible[i][j][k], first)==i+1&&c.findtotal(possible[i][j][k], second)==j+1 && c.findtotal(possible[i][j][k], third)==k+1)
                     {
                         
                         result[numberofresult]=possible[i][j][k];
                         numberofresult++;
                     }
                   }
                }   
            }
            
        }
          
          
          
           if(dimm==4)
        {
            char first=question.charAt(0);
            char second=question.charAt(2);
            char third=question.charAt(4);
            char fourth=question.charAt(6);
           String possible[][][][]=new String[5][5][5][5];
           for(int i=1;i<=5;i++)
           {
               for(int j=1;j<=5;j++)
               {
                   for(int k=1;k<=5;k++)
                   {
                       for(int l=1;l<=5;l++){
                   possible[i-1][j-1][k-1][l-1]="This sentence contains "+c.number(i, first)+" and "+c.number(j, second)+" and "+c.number(k, third)+" and "+c.number(l, fourth);
                       }
                   }
               }
               
           }
           
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++){
                    
                    for(int k=0;k<5;k++)
                   {
                        for(int l=0;l<5;l++){
                        if(c.findtotal(possible[i][j][k][l], first)==i+1&&c.findtotal(possible[i][j][k][l], second)==j+1 && c.findtotal(possible[i][j][k][l], third)==k+1 && c.findtotal(possible[i][j][k][l], fourth)==l+1 )
                     {
                         
                         result[numberofresult]=possible[i][j][k][l];
                         numberofresult++;
                     }
                        }
                   }
                }   
            }
            
        }
          
           
           if(dimm==5)
        {
            char first=question.charAt(0);
            char second=question.charAt(2);
            char third=question.charAt(4);
            char fourth=question.charAt(6);
            char fifth=question.charAt(8);
           String possible[][][][][]=new String[5][5][5][5][5];
           for(int i=1;i<=5;i++)
           {
               for(int j=1;j<=5;j++)
               {
                   for(int k=1;k<=5;k++)
                   {
                       for(int l=1;l<=5;l++){
                           for(int m=1;m<=5;m++){
                   possible[i-1][j-1][k-1][l-1][m-1]="This sentence contains "+c.number(i, first)+" and "+c.number(j, second)+" and "+c.number(k, third)+" and "+c.number(l, fourth)+" and "+c.number(m, fifth);
                           }
                           }
                   }
               }
               
           }
           
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++){
                    
                    for(int k=0;k<5;k++)
                   {
                        for(int l=0;l<5;l++){
                            for(int m=0;m<5;m++){
                        if(c.findtotal(possible[i][j][k][l][m], first)==i+1&&c.findtotal(possible[i][j][k][l][m], second)==j+1 && c.findtotal(possible[i][j][k][l][m], third)==k+1 && c.findtotal(possible[i][j][k][l][m], fourth)==l+1  && c.findtotal(possible[i][j][k][l][m], fifth)==m+1 )
                     {
                         
                         result[numberofresult]=possible[i][j][k][l][m];
                         numberofresult++;
                     }
                            }
                        }
                   }
                }   
            }
            
        }
           
           
           if(dimm>5)
           {
                String resultt="This sentence contains ";
        for(int i=0;i<question.length();i=i+2)
        {
            char next=question.charAt(i);
            for(int j=1;j<=5;j++)
            {
                String intermediate=resultt;
                intermediate=intermediate+c.number(j, next);
                
                if(c.findtotal(intermediate, next)==j)
                {
                    resultt=intermediate;
                    break;
                }
            }
            if(i!=question.length()-1)
            {
                resultt=resultt+" and ";
            }
        }
        System.out.print(resultt+".");

           }
           
          if(dimm<=5){
          for(int i=0;i<numberofresult;i++)
          {
              for(int j=i;j<numberofresult;j++)
              {
                  if(result[i].compareTo(result[j])>0)
                  {
                      String temp;
                      temp=result[i];
                      result[i]=result[j];
                      result[j]=temp;
                  }
              }
          }
          for(int i=0;i<numberofresult;i++)
          {
              result[i]=result[i].replace("and", ",");
          }
          for(int i=0;i<numberofresult;i++)
          {
              String replacable = " , ";
              String replacement = " and ";
              int lastIndex = -1;
              if ((lastIndex = result[i].lastIndexOf(replacable)) >= 0) {
              String f = result[i].substring(0, lastIndex);
              String b = result[i].substring(lastIndex + replacement.length() >= result[i].length() ? result[i].length() : lastIndex + replacement.length()-2,
              result[i].length());
              result[i] = f + replacement + b;
}
          }
        
        for(int i=0;i<numberofresult;i++)
        {
            System.out.print(result[i]);
            if(i!=numberofresult-1)
            {
                System.out.print(" OR ");
            }
        }
        System.out.print(".");
        }
         
        
        
        
       
        
        
    }
    
}
