package AbstractFactory;

public class AbstractPatternDemo {
    public static void main(String args[]){

        Student group1 = new TutorFactory().getTutor("Edu");
        Student group2 = new TutorFactory().getTutor("Seba");   //Create news objects depends of the tutor
        Student group3 = new TutorFactory().getTutor("Leo");

        System.out.println("The first group is: ");
        group1.list();

        System.out.println("----------------------");

        System.out.println("The second group is: ");            //Print The number of the group and their students
        group2.list();

        System.out.println("----------------------");


        System.out.println("The third group is: ");
        group3.list();
    }
}
