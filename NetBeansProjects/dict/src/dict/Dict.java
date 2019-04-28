package dict;
public class Dict extends Thread{
    /**
     * @param args the command line arguments
     */
    public void run()
    {
        System.out.println("hello world");
    }
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Dict d = new Dict();
        if(d.getPriority()==5)
        {
            d.start();
        }
        else
        {
            
            throw new Exception("USE WINDOWS MACHINE PLEASE");
        }
        
    }
    
}
