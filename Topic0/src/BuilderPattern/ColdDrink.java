package BuilderPattern;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Bottle();            //Instantiate a new Bottle object
    }

    @Override
    public abstract float price();      //Override the price function

}
