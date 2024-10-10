public class PotpieToString{
    private int year;
    private int month;
    private int day;
    
    public PotpieToString(int y,int m,int d){
        year = y;
        month = m;
        day = d;
        
        System.out.printf("The constructer is %s\n:",this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d",year,month,day);
    }
}