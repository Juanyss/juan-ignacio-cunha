package builderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args){
        DbConnectionImp ConnImp = new DbConnectionImp(new SqlServerBuilder());
        ConnImp.createDbConnection();
        System.out.println("Data Base type: " + ConnImp.getDbConnection().getType());
        System.out.println(" ");


        ConnImp.setDbConnectionBuilder(new PostgreSqlBuilder());
        ConnImp.createDbConnection();
        System.out.println("Data Base type: " + ConnImp.getDbConnection().getType());
        System.out.println(" ");


        ConnImp.setDbConnectionBuilder(new SqlServerBuilder());
        ConnImp.createDbConnection();
        System.out.println("Data Base type: " + ConnImp.getDbConnection().getType());
    }
}
