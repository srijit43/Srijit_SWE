
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<String>();
        
        food.add("Pizza");
        food.add("Hot Dog");
        food.add("Cheeseburger");
        
        food.set(0,"sushi");
        food.remove(1);
        // food.clear;
        
        System.out.println("Menu card");
        
        for(int i=0; i<food.size(); i++){
            System.out.printf("%d:%s\n",i,food.get(i));
        }
        
        
        
    }
}
