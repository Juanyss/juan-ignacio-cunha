package AbstractFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamSeba implements Student{
    @Override
    public void list(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Rita Echeverria");                    //Override the method list from student and create a list of
        list.add("Gaston Matta");                       //students
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));            //Print the list by console
        }
    }
}
