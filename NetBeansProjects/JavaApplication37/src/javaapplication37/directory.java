/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;
import java.io.*;
public class directory {
public static void main(String [] args)
{
int j=1,k=1;
File f= new File("c:\\");
File[] arr = f.listFiles();
for(int i=0;i<arr.length;i++)
{
if(arr[i].isFile())
{
System.out.println("File "+(j++)+" : "+arr[i]);
}
else
{
System.out.println("Directory "+(k++)+" : "+arr[i]);
}
}
}
}