package ProxyPattern;

public class RealMsg implements Message {
    public String student;

    public RealMsg(String student){
       this.student = student;
       startMsg(student);
    }

    @Override
    public void msg(){
        System.out.println(student + " are attending to the bootcamp");
    }

    private void startMsg(String student){
        System.out.println(student + " Start the bootcamp");
    }
}
