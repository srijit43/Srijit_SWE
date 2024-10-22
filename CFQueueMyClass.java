/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

import java.util.*;


public class MyClass {
  public static void main(String args[]) {
      
      Queue<Integer> queue = new ArrayDeque<Integer>();
      
      System.out.println("Adding elements to the queue!"); //Complexity O(1)
      
      queue.add(21);  
      queue.add(34);
      queue.add(3);
      queue.add(12);
      
      System.out.println("See the first element!");
      
      System.out.println(queue.peek()); //Complexity O(1) and the first element is shown
      
      System.out.println("Remove the first element!");
      
      
      System.out.println(queue.poll()); //Complexity O(1) and the first element is removed
      
      
      System.out.println("Iterate and remove elements from the queue!"); //Complexity O(n)
      
      
      while(!queue.isEmpty()){
          
          System.out.println(queue.poll());
      }
      
      
      
      
  }
      
}