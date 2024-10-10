public class Time{
    private int hour;
    private int min;
    private int sec;
    
    public void setTime(int h, int m, int s){
        
        hour = ((h>0 && h<24) ? h:0);
        min = ((m>0 && m<60) ? m:0);
        sec = ((sec>0 && sec<60) ? s:0);
        
        
        
    }
    
    public String toMilitary(){
        
        return String.format("%02d:%02d:%02d",hour,min,sec);
        
    }
    
}