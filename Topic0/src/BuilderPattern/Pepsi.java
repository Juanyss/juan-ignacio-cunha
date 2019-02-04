package BuilderPattern;

public class Pepsi extends ColdDrink{
    @Override
    public String name(){
        return "Pepsi";
    }
                                                        //Item Details
    @Override
    public float price(){
        return 0.75f;
    }
}
