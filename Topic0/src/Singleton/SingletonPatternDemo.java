package Singleton;

public class SingletonPatternDemo {
    public static void main(String args[]){
        //Create a dbConnection Object
        dbConnection MySql = dbConnection.getConnection();

        //Can't create a dbConnection object because already exist one
        dbConnection anotherMySql = dbConnection.getConnection();


        //dbConnection Functions calls

        MySql.notice();

        MySql.warning();
    }
}
