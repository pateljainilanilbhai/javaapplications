package javaapplication58;

import java.util.Stack;

public class JavaApplication58 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //stack starts with 1 instead of 0;
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(5);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(10);
        s.push(50);
        s.push(14);
        s.push(12);
        System.out.println("size: "+s.size());
        System.out.println("element at 2:"+s.elementAt(2));
        System.out.println("capacity "+s.capacity());
        if(s.contains(50))
        {
            System.out.println("50 is at "+s.search(50));
        }
        s.set(1, 4561);
        s.setElementAt(4895615, 2);
        System.out.println("printing ");
        for (Integer i : s) {
            System.out.println(i);
        }
        System.out.println("clearing");
        s.clear();
        System.out.println("ADDING");
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(2, 500);
        System.out.println("printing ");
        for (Integer i : s) {
            System.out.println(i);
        } 
    }
    
}
