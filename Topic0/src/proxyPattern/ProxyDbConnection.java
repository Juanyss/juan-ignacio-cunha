package proxyPattern;

public class ProxyDbConnection implements DbConnection {
    private RealDbConnection realDbConnection;
    private String dbName;
    private String dbUser;
    private String dbPassword;

    public ProxyDbConnection(String dbName, String dbUser, String dbPassword) {
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }

    @Override
    public void connect(){
     if(realDbConnection == null){
         realDbConnection = new RealDbConnection(this.dbName,this.dbUser,this.dbPassword);
     }
     realDbConnection.connect();
     realDbConnection.welcome();
    }
}
