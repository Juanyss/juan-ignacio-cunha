package Singleton;

import java.util.ArrayList;

public class SingleObject {
    private static SingleObject obj1 = new SingleObject();

    private void SingleObject(){

    }

    public static SingleObject getObj1(){
        return obj1;
    }

    public void welcome(){
        System.out.println("Example of singleton pattern");

    }

    public ArrayList<String> LeandroGroup(){
        ArrayList<String> students = new ArrayList<String>();;
        students.add("Juan Ignacio Cunha");
        students.add("Franco Lujan");
        students.add("Leonardo Caraballo");
        return students;
    }
}
