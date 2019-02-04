package BuilderPattern;

public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();           //Instantiate a Wrapper object
    }

    @Override
    public abstract float price();      //Override the price

}
