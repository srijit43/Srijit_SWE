public class MainTime{
    public static void main(String[] args){
        TimeSetter timeobject = new TimeSetter();
        TimeSetter timeobject1 = new TimeSetter(12);
        TimeSetter timeobject2= new TimeSetter(14,23);
        TimeSetter timeobject3 = new TimeSetter(19,3,5);
        
        System.out.printf("%s\n", timeobject1.ToMilitary());
    }
}