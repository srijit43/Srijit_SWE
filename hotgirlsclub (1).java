public class HotGirlsClub{
    private String firstname;
    private String lastname;
    private static int members = 0;
    
    public HotGirlsClub(String fname, String lname){
        firstname = fname;
        lastname = lname;
        members++;
        
        System.out.printf("Welcome %s %s to my crib, bodycount: %d\n ",firstname,lastname,members);
    }
    
    public String getFname(){
        return firstname;
    }
    
    public String getLname(){
        return lastname;
    }
    
    public static int getMembers(){
        return members;
    }
    
    
}