package ProxyPattern;



public class ProxyMsg implements Message{
    public RealMsg realMsg;
    public String student;

    public ProxyMsg(String student){
        this.student = student;
    }

    @Override
    public void msg(){
        if(realMsg == null){
            realMsg = new RealMsg(student); //Check if exist a instantiate class or not
        }
        realMsg.msg();
    }
}
