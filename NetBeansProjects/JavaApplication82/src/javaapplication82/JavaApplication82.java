/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication82;

/**
 *
 * @author jainil
 */
public class JavaApplication82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(long i=2;i<=10;i++)
        {
            
            System.out.println("<fieldset style=\"background-color:green\">\n" +
"<legend>Q"+i+"</legend>\n" +
"<br/>\n" +
"<input type=\"radio\" name=\""+i+"\" value=\"a\"> </input><br/>\n" +
"<input type=\"radio\" name=\""+i+"\" value=\"b\"> </input><br/>\n" +
"<input type=\"radio\" name=\""+i+"\" value=\"c\"> </input><br/>\n" +
"<input type=\"radio\" name=\""+i+"\" value=\"d\"> </input><br/>\n" +
"</fieldset>");
        }
    }
    
}
