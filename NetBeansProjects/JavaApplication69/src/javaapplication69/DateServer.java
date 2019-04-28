package javaapplication69;

import java.net.*;
import java.io.*;
import java.util.*;

public class DateServer
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket s=new ServerSocket(5010);

        while(true)
        {
            System.out.println("Waiting For Connection ...");
            Socket soc=s.accept();
            DataOutputStream out=new DataOutputStream(soc.getOutputStream());
            out.writeBytes("Server Date" + (new Date()).toString() + "\n");
            out.close();
            soc.close();
        }
        
    }
}