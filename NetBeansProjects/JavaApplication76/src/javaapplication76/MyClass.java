/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

/**
 *
 * @author jainil
 */
public class MyClass {
public static void main(String[] args) {
try {
f();
} catch (InterruptedException e) {
System.out.println("1");
throw new RuntimeException();
} catch (RuntimeException e) {
System.out.println("2");
return;
} catch (Exception e) {
System.out.println("3");
} finally {
System.out.println("4");
}
System.out.println("5");
}
// InterruptedException is a direct subclass of Exception.
static void f() throws InterruptedException {
throw new InterruptedException("Time for lunch.");
}
} 