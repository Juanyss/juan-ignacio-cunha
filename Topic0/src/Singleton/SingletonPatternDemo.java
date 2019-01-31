package Singleton;

public class SingletonPatternDemo {
    public static void main(String args[]){
        SingleObject obj1 = SingleObject.getObj1();

        obj1.welcome();
        for(int i = 0; i< obj1.LeandroGroup().size(); i++){
            System.out.println(obj1.LeandroGroup().get(i));
        }
    }
}
