import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        
        ArrayList<String> bakeryList = new ArrayList<String>();
        
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        
        ArrayList<String> produceList = new ArrayList<String>();
        
        produceList.add("zucchini");
        produceList.add("onions");
        produceList.add("tomatoes");
        
        ArrayList<String> drinkList = new ArrayList<String>();
        
        drinkList.add("soda");
        drinkList.add("ginger ale");
        
        // one for each aisle of the grocery store 
        // now we will create an array of ArrayList
        
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);
        
        System.out.println(groceryList);
        
        // A bit fancy output
        
        System.out.println("Aisle No and Items:");
        
        for(int i = 0; i < groceryList.size(); i++){
            System.out.printf("Aisle %d: %s\n", i, groceryList.get(i));
        }
    }
}
