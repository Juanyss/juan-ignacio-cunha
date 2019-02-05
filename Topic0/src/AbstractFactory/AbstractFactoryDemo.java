package AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String args[]){
        ConnectionProducer connection1 = new ConnectionProducer();
        dbConnection MySql = connection1.getConnection("MySql").getConnection();
        MySql.connection();
        MySql.disconnectMsg();

        dbConnection SqlServer = connection1.getConnection("SqlServer").getConnection();
        SqlServer.connection();
        SqlServer.disconnectMsg();

        dbConnection NoDb = connection1.getConnection("").getConnection();
    }
}
