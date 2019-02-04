package BuilderPattern;

public class MealBuilder  {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());      //Instantiate new Meal Object and add items
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickerBurger());  //Instantiate new Meal Object and add items
        meal.addItem( new Coke());
        return meal;
    }

}
