package AbstractFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamEdu implements Student {

    @Override
    public void list(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Natanael Galfrascoli");
        list.add("Rodrigo Cuevas");                     //Override the method list from student and create a list of
        list.add("Maximiliano Ulibarrie");              //students
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));            //Print the list by console
        }
    }
}
