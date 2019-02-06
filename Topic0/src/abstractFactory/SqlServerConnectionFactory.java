package abstractFactory;

public class SqlServerConnectionFactory implements DbConnectionFactory {
    @Override
    public DbConnection getConnection(){
        return new SqlServerConnection();
    }
}
