
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
        
        fakefanpoly riko = new fakefanpoly();
        
        footballclub assna = new arsenal();
        footballclub chessi = new chelsea();
        
        riko.saying(assna);
        riko.saying(chessi);
        
        
    }
}
