import java.util.*;
class Main{
    static int max(int num1,int num2)
    {
     if(num1> num2)
       return num1;
     else
       return num2;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n,i,j,count=0;
      String str1,str2;
      System.out.println("Enter String 1");
      str1=sc.nextLine();
      System.out.println("Enter String 2");
      str2=sc.nextLine();
      int row=str1.length();
      int col=str2.length();
      char LCS[]=new char[row+1];
      int c[][]=new int[row+1][col+1];
      for(i=0;i<row;i++)
      {
         for(j=0;j<col;j++)
         {
           if(i==0||j==0)
           {
            c[i][j]=0;
           }
        }
     }
     for(i=1;i<=row;i++)
     {
       for(j=1;j<=col;j++)
       {
        if(str1.charAt(i-1)==str2.charAt(j-1))
        {
          c[i][j]=c[i-1][j-1]+1;
        }
        else
        {
          c[i][j]=max(c[i][j-1],c[i-1][j]);
        }
       }
     }
     for(i=0;i<=row;i++)
     {
      
     }
     for(i=row,j=col;i>=0&&j>=1;)
     {
        if(c[i][j]!=c[i][j-1])
        {
          LCS[count]=str1.charAt(i-1);
          j--; 
          i--;
          count++;
        }  
        else if(c[i][j]==c[i][j-1])
        {
         j--;
        }
     }
       
        System.out.println(count);
   }
 }