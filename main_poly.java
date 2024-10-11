
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        
        footballclub slogans[] = new footballclub[2];
        
        slogans[0] = new chelsea();
        slogans[1] = new arsenal();
        
        for(int i=0;i<2;++i){
            slogans[i].banner();
        }
        
        
    }
}
