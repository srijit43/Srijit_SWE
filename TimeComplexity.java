/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

public class MyClass {
  public static void main(String args[]) {
      
    int n = 5;
    
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
            System.out.println("i = " +i+ " j =" +j);
        }
        System.out.println("End of inner loop!");
    }
    System.out.println("End of outer loop!");
    
  }
}