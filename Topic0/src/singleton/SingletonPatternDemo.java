package singleton;

public class SingletonPatternDemo {
    public static void main(String args[]){
        //Create a DbConnection Object
        DbConnection mySql = DbConnection.getConnection();

        //Can't create a DbConnection object because already exist one
        DbConnection anotherMySql = DbConnection.getConnection();


        //DbConnection Functions calls

        mySql.notice();

        mySql.warning();
    }
}
