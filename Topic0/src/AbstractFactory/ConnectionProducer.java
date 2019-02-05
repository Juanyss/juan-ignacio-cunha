package AbstractFactory;

public class ConnectionProducer {

    public dbConnectionFactory getConnection(String type){

        if(type.equals("MySql")){
            return new MySqlConnectionFacotry();
        }else if (type.equals("SqlServer")){
            return new SqlServerConnectionFactory();
        }
        throw new IllegalArgumentException("DB " + type + " not found");
    }



}
