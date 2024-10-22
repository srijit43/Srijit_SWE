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
      
      ArrayList<Integer> riko = new ArrayList<Integer>();
      
      riko.add(1);
      riko.add(5);
      riko.add(3);
      riko.add(9);
      riko.add(7);
      
      for(int i=0;i<riko.size();i++){
          System.out.println(riko.get(i));    // Complexity O(n)
      }
      
      System.out.println("Check if an item is present!");   // Complexity O(n)
      
      if (riko.contains(7)){
          System.out.println("True");
      }else{
          System.out.println("False");
      }
      
      System.out.println("Adding an item at a given index!");  // Complexity O(1)
     
      riko.set(1, 90);
     
      for(int i=0;i<riko.size();i++){
          System.out.println(riko.get(i));
      }
      
      System.out.println("Removing an item at a given index!"); // Complexity O(n)
      
      riko.remove(1);
     
      for(int i=0;i<riko.size();i++){
          
          System.out.println(riko.get(i));
      }
      
      System.out.println(riko.size());  // Complexity O(n)
      
      
      
      
      
      
      
    
  }
}