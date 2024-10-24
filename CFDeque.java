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
      
      Deque<Integer> riko = new ArrayDeque<Integer>();
      
      System.out.println("Adding at the end:");
      
      riko.addLast(21);  // Complexity O(n)
      riko.addLast(3);
      riko.addLast(23);
      
      System.out.println(riko.peekFirst()); //Complexity O(1)
      
      System.out.println(riko.peekLast()); //Complexity O(1)
      
      while(!riko.isEmpty()){
          System.out.println(riko.pollLast()); //Complexity O(n)
      }
      
      System.out.println("Adding at the beginning:");
      
      riko.addFirst(29);
      riko.addFirst(35); //Complexity O(1)
      
      
      while(!riko.isEmpty()){
          System.out.println(riko.pollFirst()); //Complexity O(n)
      }
      
      
      
      
   
  }
}