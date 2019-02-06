package abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String args[]){
        ConnectionProducer connection1 = new ConnectionProducer();
        DbConnection mySql = connection1.getConnection("MySql").getConnection();
        mySql.connection();
        mySql.disconnectMsg();

        DbConnection sqlServer = connection1.getConnection("SqlServer").getConnection();
        sqlServer.connection();
        sqlServer.disconnectMsg();

        DbConnection noDb = connection1.getConnection("").getConnection();
        DbConnection nullDb = connection1.getConnection(null).getConnection();
    }
}
