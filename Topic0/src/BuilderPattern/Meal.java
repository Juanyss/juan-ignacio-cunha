package BuilderPattern;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0;
        for(int i = 0; i< items.size(); i++){
            cost += items.get(i).price();               //Calculate items price total
        }
        return cost;
    }

    public void showItems(){
        for(int i = 0; i<items.size(); i++){
            System.out.println("Item: "+ items.get(i).name());
            System.out.println(" - Packing: " + items.get(i).packing().pack()); //Print items details
            System.out.println(" - Price: " + items.get(i).price());
        }
    }
}
