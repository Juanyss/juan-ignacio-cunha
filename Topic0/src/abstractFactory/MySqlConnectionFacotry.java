package abstractFactory;

public class MySqlConnectionFacotry implements DbConnectionFactory {
    @Override
    public DbConnection getConnection(){
        return new MySqlConnection();
    }
}
