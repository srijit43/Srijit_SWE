import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        
/*        ArrayList<String> bakeryList = new ArrayList<String>();
        
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
        }*/
        
        int[] numbers = new int[3];
        String[] str = new String[4];
        
        arrlistfood[] fridge = new arrlistfood[3];
        
        arrlistfood food1 = new arrlistfood("Pizza");
        arrlistfood food2 = new arrlistfood("Burger");
        arrlistfood food3 = new arrlistfood("Ramen");
        
        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;
        
        System.out.println(fridge[0].name);
        
        
        
        
        
    }
}
