package abstractFactory;

public class ConnectionProducer {

    public DbConnectionFactory getConnection(String type){

        if(type == null){
            throw new IllegalArgumentException("DB can't be null");
        }else if("MySql".equals(type)){
            return new MySqlConnectionFacotry();
        }else if ("SqlServer".equals(type)){
            return new SqlServerConnectionFactory();
        }else{
            throw new IllegalArgumentException("DB " + type + " not found");
        }

    }
}
