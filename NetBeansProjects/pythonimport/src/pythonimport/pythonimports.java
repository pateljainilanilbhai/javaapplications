import java.io.*;
public class pythonimports {
    String space=" ";
     void fill(String a)
{    
File f= new File(a);
String p[]=f.list();
if(p!=null)
for(int i=0;i<p.length;i++)
{
    File z=new File(a+"\\"+p[i]);
if(z.isFile()==true)
{System.out.println(
"pip install "+p[i]);}
if(z.isDirectory()==true)
{
    String k=space;
System.out.println(space+p[i]);
space=space+" ";
fill(a+'\\'+p[i]);
space=k;
}}}
public static void main(String [] args)
{new pythonimports().fill("D:\\pythonfiles");}
}
