package builderPattern;

public class DbConnection implements DbConnectionType {
    private String type;

    public String getType() {
        return type;
    }

    @Override
    public void setDbType(String type) {
        this.type = type;
    }
}
