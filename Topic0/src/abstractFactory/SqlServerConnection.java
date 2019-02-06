package abstractFactory;

public class SqlServerConnection implements DbConnection {

    @Override
    public void connection(){
        System.out.println("Connecting to SqlServer");
    }

    @Override
    public void disconnectMsg(){
        System.out.println("Disconnecting from SqlServer DB");
    }
}
