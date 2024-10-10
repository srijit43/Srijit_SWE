/*Main class to display time displayer */

public class TimeDisplay
{
    public static void main(String[] args) {
        Time timeObject = new Time();
        
        System.out.println(timeObject.toMilitary());
        
        timeObject.setTime(2,34,12);
        
        System.out.println(timeObject.toMilitary());
    }
    
    
    
    
}
