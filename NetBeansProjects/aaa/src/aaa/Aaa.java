package aaa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jainil
 */
public class Aaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter file name");
        fileName=sc.next();
        
        try {
            System.out.println("WRITTING A TEXT FILE:TYPE exit TO EXIT");
            BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(fileName));
            String s;
            s=sc.nextLine();
            while(s.compareTo("exit")!=0)
                {
            bufferedWriter.write(s);
            s=sc.nextLine();
            bufferedWriter.newLine();
                }
            bufferedWriter.close();
        }
        catch(Exception ex) {
        }
        String line = null;
        System.out.println("READING A FILE");

        try {
            BufferedReader bufferedReader =new BufferedReader(new FileReader(fileName));
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();         
        }
        catch (Exception ex) {            
        }
    }

    }
    

