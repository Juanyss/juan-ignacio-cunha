package builderPattern;

public class SqlServerBuilder implements DbConnectionBuilder {
    private DbConnection dbConnection;

    public SqlServerBuilder() {
        this.dbConnection = new DbConnection();
    }

    @Override
    public void dbName(){
        dbConnection.setDbType("SqlServer Connection");
    }

    @Override
    public DbConnection dbType(){
        return  this.dbConnection;
    }


}
