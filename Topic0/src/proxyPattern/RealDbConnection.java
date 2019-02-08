package proxyPattern;

public class RealDbConnection implements DbConnection {
    private String dbName;
    private String dbUser;
    private String dbPassword;

    public RealDbConnection(String dbName, String dbUser, String dbPassword) {
        this.dbName = dbName;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;

        creatingConnection();
    }

    private void creatingConnection(){
        System.out.println("Setting connection to " + dbName + " Data Base ");
    }

    @Override
    public void connect(){
        System.out.println("Connection to " + dbName + " established");
    }


    public void welcome(){
        System.out.println("Welcome user " + dbUser);
    }


}
