package singleton;

public class dbConnection {
    private static dbConnection connection;

    private dbConnection(){}

    public static dbConnection getConnection(){
        if(connection == null){
            connection = new dbConnection();        //Create a new DbConnection private object
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
