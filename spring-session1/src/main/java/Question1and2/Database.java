package Question1and2;

public class Database {
    private String port;
    private String name;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "port='" + port + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
