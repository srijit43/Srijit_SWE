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
      
      Stack<String> riko = new Stack<String>();
      
      riko.push("Srijit");  //Complexity O(1)
      riko.push("Mohamed");
      riko.push("Amir");
      riko.push("Abrar");
      
      System.out.println("Check if an item is present!"); //Complexity O(n)
      
      if(riko.contains("Mohamed")){
          System.out.println("True");
          
      }else{
          System.out.println("False");
      }
      
      
       System.out.println("Check the last element!"); //Complexity O(1)
       
       System.out.println(riko.peek());
       
       System.out.println("Remove the top element!"); //Complexity O(1) LIFO
       
       System.out.println(riko.pop());
       
       
       System.out.println("Pop the elements!");
       
       
       
       while(!riko.isEmpty()){
           System.out.println(riko.pop());   //Complexity O(n) as it iterates the entire stack till empty
       }
       
       
      
      
      
      
      
      
      
  }
      
}