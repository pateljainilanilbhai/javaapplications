import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
class Q{
    String filename;
    public Q(String filename) {
        this.filename = filename;
    }
    
	int n;
	boolean valueSet = false;
	synchronized int get(){
		if(!valueSet)
			try{
				wait();
			}catch(InterruptedException ie){
				
			}
		 System.out.println( "reading a file:" + this.filename );
        try {            BufferedReader bufferedReader =new BufferedReader(new FileReader(filename));
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);            }
            bufferedReader.close();
            
        }
        catch (Exception ex) {             } 
		valueSet = false;
		notify();
		return n;
	}
	synchronized void put(int n){
		if(valueSet)
			try{
				wait();
			}catch(InterruptedException ie){
				
			}
			   System.out.println( "writing to a file:" + this.filename );  
                try {
                            Scanner sc = new Scanner(System.in);   
                            File f = new File(filename);
            BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(f,true));
            String s;
            s=sc.nextLine();
           
            bufferedWriter.write(s+"\n");           
            bufferedWriter.close();
            
        }
        catch(Exception ex) {
        }
			valueSet = true;
		
		notify();
	}
}

class Writter extends Thread{
	Q q;
	Writter(Q q){
		this.q =q;
	}
	
	public void run(){
		int i=0;
		while(true){
			q.put(i++);
                }
	}
}

class Reader extends Thread{
	Q q;String filename;
	Reader(Q q){
		this.q =q;
	}
	
	public void run(){
		int i=0;
		
		while(true){
			q.get();
                        
                            } 
		}
}
public class Client {

public static void main( String args [] ) {

    String filename = "test.txt";
        Q q = new Q(filename);
	Writter wr=new Writter(q);
	Reader rr=new Reader(q);}
        


} 
