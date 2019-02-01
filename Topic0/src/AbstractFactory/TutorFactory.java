package AbstractFactory;

public class TutorFactory extends AbstractFactory {
    @Override
    public Student getTutor(String tutor) {
        if(tutor.equals("Seba")){
            return new TeamSeba();
        } else if(tutor.equals("Edu")){             //Instance a class depends of the tutor in charge
            return new TeamEdu();
        } else if( tutor.equals("Leo")){
            return new TeamLeo();
        }
        return null;
    }
}
