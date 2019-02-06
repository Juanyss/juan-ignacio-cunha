package singleton;

public class SingletonPatternDemo {
    public static void main(String args[]){
        //Create a DbConnection Object
        dbConnection MySql = dbConnection.getConnection();

        //Can't create a DbConnection object because already exist one
        dbConnection anotherMySql = dbConnection.getConnection();


        //DbConnection Functions calls

        MySql.notice();

        MySql.warning();
    }
}
