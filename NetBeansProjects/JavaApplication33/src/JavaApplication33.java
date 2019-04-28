class ThrowDemo {
   static int demoproc(String s) throws NullPointerException{
     try {
         if (s == null) {
             throw new NullPointerException("String is null.");
         } else {
             return s.length();
         }
     } catch (NullPointerException e) {
        System.out.println("NullPointerException Caught inside demoproc method...");
          throw e; // rethrow the exception
     }
   }
   public static void main(String args[]) {
     try {
         String s = null;
         int len = demoproc(s);
         System.out.println("Lenght of the String is = " + len);
     } catch (NullPointerException e) {
        System.out.println("NullPointerException is caught in caller method if callee method not able to handle it.. " + e);
     }
   }
}
