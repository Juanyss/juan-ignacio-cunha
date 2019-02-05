package AbstractFactory;

public class SqlServerConnectionFactory implements dbConnectionFactory {
    @Override
    public dbConnection getConnection(){
        return new SqlServerConnection();
    }
}
