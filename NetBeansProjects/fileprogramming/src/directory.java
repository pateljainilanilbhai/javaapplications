import java.io.*;
public class directory {
    String space=" ";
     void fill(String a)
{    
File f= new File(a);
String p[]=f.list();
if(p!=null)
for(int i=0;i<p.length;i++)
{
    File z=new File(a+"\\"+p[i]);
//if(z.isFile()==true)
//{
//if(p[i].endsWith(".py")){
//    System.out.println("import "+p[i]+"\b"+"\b"+"\b");}
//}
if(z.isDirectory()==true)
{
    String k=space;
    if(p[i].endsWith("info")!=true){
    System.out.println("import "+p[i]);}
space=space+" ";
//fill(a+'\\'+p[i]);
space=k;
}
}}
public static void main(String [] args)
{new directory().fill("C:\\Users\\jainil\\Anaconda3\\Lib\\site-packages");}
}
