package abstractFactory;

public class ConnectionProducer {

    public DbConnectionFactory getConnection(String type){

        if(type == null){
            type = "null";
        }

        switch(type.toLowerCase()){
            case "null":
                throw new IllegalArgumentException("DB can't be null");
            case "mysql":
                return new MySqlConnectionFacotry();
            case "sqlserver":
                return new SqlServerConnectionFactory();
            default:
                throw new IllegalArgumentException("DB " + type + " not found");
        }
    }
}
