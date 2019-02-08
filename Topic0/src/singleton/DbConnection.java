package singleton;

public class DbConnection {
    private static DbConnection connection;

    private DbConnection(){}

    public static DbConnection getConnection(){
        if(connection == null){
            connection = new DbConnection();        //Create a new DbConnection private object
            connection.startNotice();
        }else{
            System.out.println("Connection to DB already exist");
        }
        return connection;
    }

    private void startNotice(){
        System.out.println("Starting new connection");
    }

    public void notice(){
        System.out.println("New connection to DB");
    }

    public void warning(){
        System.out.println("Connection to DB already exist");
    }
}
