package builderPattern;

public class DbConnectionImp {
    private DbConnectionBuilder dbConnectionBuilder;

    public DbConnectionImp(DbConnectionBuilder dbConnectionBuilder) {
        this.dbConnectionBuilder = dbConnectionBuilder;
    }

    public DbConnection getDbConnection() {
        return dbConnectionBuilder.dbType();
    }

    public void setDbConnectionBuilder(DbConnectionBuilder dbConnectionBuilder) {
        this.dbConnectionBuilder = dbConnectionBuilder;
    }

    public void createDbConnection(){
        dbConnectionBuilder.dbName();
        dbConnectionBuilder.dbType();
    }
}
