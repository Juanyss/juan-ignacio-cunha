package builderPattern;

public class MySqlBuilder implements DbConnectionBuilder {
    private DbConnection dbConnection;

    public MySqlBuilder() {
        this.dbConnection = new DbConnection();
    }

    @Override
    public void dbName(){
        dbConnection.setDbType("MySql Connection");
    }

    @Override
    public DbConnection dbType(){
        return  this.dbConnection;
    }
}
