package AbstractFactory;

public class MySqlConnectionFacotry implements dbConnectionFactory {
    @Override
    public dbConnection getConnection(){
        return new MySqlConnection();
    }
}
