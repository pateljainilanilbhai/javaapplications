package javaapplication69;

import java.io.*;
import java.net.*;

public class DateClient
{
    public static void main(String args[]) throws Exception
    {
        Socket soc=new Socket(InetAddress.getLocalHost(),5010);        
        BufferedReader in=new BufferedReader(
                new InputStreamReader(
                        soc.getInputStream()
                        )
                    );

        System.out.println(in.readLine());
    }    
}