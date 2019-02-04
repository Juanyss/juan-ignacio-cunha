package BuilderPattern;

public class Coke extends ColdDrink {
    @Override
    public String name(){
        return "Coke";
    }
                                                            //Item Details
    @Override
    public float price(){
        return 1.00f;
    }
}
