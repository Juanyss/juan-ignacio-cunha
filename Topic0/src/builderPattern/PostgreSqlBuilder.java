package builderPattern;

public class PostgreSqlBuilder implements DbConnectionBuilder{
    private DbConnection dbConnection;

    public PostgreSqlBuilder() {
        this.dbConnection = new DbConnection();
    }

    @Override
    public void dbName(){
        dbConnection.setDbType("PostgreSql Connection");
    }

    @Override
    public DbConnection dbType(){
        return  this.dbConnection;
    }
}
