package proxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args){
        DbConnection example1 = new ProxyDbConnection("FSF-Db","admin","admin");

        example1.connect();
    }
}
