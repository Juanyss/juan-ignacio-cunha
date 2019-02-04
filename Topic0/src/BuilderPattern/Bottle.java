package BuilderPattern;

public class Bottle implements Packing {
    @Override
    public String pack(){
        return "Bottle";        //Override function pack from Packing class
    }
}
