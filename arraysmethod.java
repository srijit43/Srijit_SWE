/*add 5 to each element of an array */

public class arraysmethod{
    public static void main(String[] args){
        int riku[] = {1,2,3,4};
        
        change(riku);
        
        for (int y:riku){
            System.out.println(y);
        }
        
    }
    
    public static void change(int x[]){
        for (int i=0;i < x.length; i++){
            x[i] += 5;
        }
        
    }
}