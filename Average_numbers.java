
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

// variable length arguements

public class Main
{
    public static void main(String[] args) {
        
        System.out.println(average(4,6,8));
        
    }
    
    public static int average(int...numbers){
        int total = 0;
        for(int x:numbers){
            total = total + x;
        }
        return total/numbers.length;
    }
}
