package AbstractFactory;

import java.util.*;

public class TeamLeo implements Student {

    @Override
    public void list() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Juan Ignacio Cunha");                 //Override the method list from student and create a list of
        list.add("Leandro Caraballo");                  //students
        list.add("Franco Lujan");
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));            //Print the list by console
        }
    }
}