package BuilderPattern;

public class VegBurger extends Burger {
    @Override
    public String name(){
        return "Veg Burger";
    }
                                                        //Item Details
    @Override
    public float price(){
        return 1.25f;
    }
}
