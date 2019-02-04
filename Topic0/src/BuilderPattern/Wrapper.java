package BuilderPattern;

public class Wrapper implements Packing {
    @Override
    public String pack(){
        return "Wrapper";       //Override function pack from Packing class
    }
}
