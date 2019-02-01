package Singleton;

import java.util.ArrayList;

public class SingleObject {
    //SingleObject creation
    private static SingleObject obj1 = new SingleObject();

    //Private Contructor (Nobody can instanciate this class)
    private void SingleObject(){

    }

    //Get to get the only object created with this class
    public static SingleObject getObj1(){
        return obj1;
    }


    //Function Example1
    public void welcome(){
        System.out.println("Example of singleton pattern");

    }

    //Function Example2
    public ArrayList<String> LeandroGroup(){
        ArrayList<String> students = new ArrayList<String>();;
        students.add("Juan Ignacio Cunha");
        students.add("Franco Lujan");
        students.add("Leonardo Caraballo");
        return students;
    }
}
