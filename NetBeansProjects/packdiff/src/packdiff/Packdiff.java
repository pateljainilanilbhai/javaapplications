/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packdiff;

/**
 *
 * @author jainil
 */
public class Packdiff {

    /**
     * @param args the command line arguments
     */
    void defaultmethod()
        {
                System.out.println("Hello from pack1 default method");
        }
    public void method()
        {
                System.out.println("Hello from pack1 public method");
        }
    private void privatemethod()
        {
                System.out.println("Hello from pack1 private method");
        }
    protected void protectedmethod()
        {
                System.out.println("Hello from pack1 protected method");
        }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("packdiff main call");
    }
    
}
