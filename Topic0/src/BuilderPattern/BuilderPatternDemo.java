package BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String args[]){
        MealBuilder order1 = new MealBuilder();


        MealBuilder order2 = new MealBuilder();
        order2.prepareNonVegMeal();


        System.out.println("Order 1");
       order1.prepareVegMeal().showItems();
        System.out.println(order1.prepareVegMeal().getCost());

    }
}
