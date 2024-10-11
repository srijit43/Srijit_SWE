public class fnlExample{
    private int sum;
    private final int NUMBER;  // cannot modify a final
    
    public fnlExample(int x){  //constructor
        NUMBER = x;
    }
    
    public void add(){  //add method
        sum += NUMBER;
    }
    
    public String toString(){
        return String.format("Sum = %d\n", sum);
    }
}