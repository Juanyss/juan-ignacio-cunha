package BuilderPattern;

public class ChickerBurger extends Burger {
    @Override
    public String name(){
        return "Chicken burger";
    }
                                                        //Item Details
    @Override
    public float price(){
        return 1.15f;
    }
}
