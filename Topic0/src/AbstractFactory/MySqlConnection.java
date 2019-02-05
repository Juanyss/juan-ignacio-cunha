package AbstractFactory;

public class MySqlConnection implements dbConnection{
    @Override
    public void connection(){
        System.out.println("Connecting to MySql");
    }
    @Override
    public void disconnectMsg(){
        System.out.println("Disconnecting from MySql DB");
    }
}
