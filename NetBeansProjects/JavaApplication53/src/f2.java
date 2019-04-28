import java.io.*;

import java.util.Date;
public class f2 {
public static void main(String args[])
{
    File f = new File("D:\\f2.txt");
try {
if (f.createNewFile()) {
System.out.print("File Created");
} else {
System.out.print("File Already exists");
}
} catch (IOException e) {
System.out.print(e.getMessage());
}


System.out.println("canRead()=" + f.canRead());
System.out.println("canWrite()=" + f.canWrite());
f.setWritable(true);
System.out.println("canWrite()=" + f.canWrite());
System.out.println("canRead()=" + f.canRead());
System.out.println("setReadOnly()=" + f.setReadOnly());
System.out.println("canWrite()=" + f.canWrite());
System.out.println("canRead()=" + f.canRead());
System.out.println("getParent()=" + f.getParent());
System.out.println("getpath()=" + f.getPath());
System.out.println("getAbsolutePath()=" + f.getAbsolutePath());
System.out.println("File Exists()=" + f.exists());
System.out.println("isFile()=" + f.isFile());
System.out.println("isDirectory()=" + f.isDirectory());
System.out.println("LastModified()=" + new Date(f.lastModified()));
System.out.println("File length()=" + f.length());


//rename a File
File f1 = new File("D:\\f11.txt");
File f2 = new File("D:\\f2.txt");
try {
if (f1.createNewFile()&&f2.createNewFile()) {

System.out.println("File Created");
} else {
System.out.println("File Already exists");
}
} catch (IOException e) {
System.out.print(e.getMessage());
}
if (f1.renameTo(f2)) {
System.out.println("File Renamed");
} else {
System.out.println("File can't renamed");
}



//if file exists delete it
File f5 = new File("D:\\f2.txt");
if (f5.exists()) {
System.out.println("File Exists");
if (f5.delete()) {
System.out.println("File Deleted Successfully");
} else {
System.out.println("File can't be Deleted");
}
}

//make directories mkdirs
File f3 = new File("D:\\f3");
if (f3.mkdirs()) {
System.out.println("Directories created");
} else {
System.out.println("Directories can't created");
}

//make directory mkdir a folder is going to create
File f4 = new File("D:\\f4");
if (f4.mkdir()) {
System.out.println("Directory created");
} else {
System.out.println("Directory can't created");
}


//file object is directory or file
System.out.println("is directory " + f4.isDirectory());

}}