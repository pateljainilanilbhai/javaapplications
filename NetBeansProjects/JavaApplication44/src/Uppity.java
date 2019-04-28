public class Uppity {
   static  int a()
    {
        int a=0;int b=0;
            try { 
       return (a/b); 
     }  
             catch (ArithmeticException e) { 
       return 0; 
     } 
            catch (RuntimeException e) { 
       return -1; 
   } 
           finally { 
      System.out.print("done"); 
  }     
    }
        public static void main(String[] args) {
            System.out.println( a());
        }
} 