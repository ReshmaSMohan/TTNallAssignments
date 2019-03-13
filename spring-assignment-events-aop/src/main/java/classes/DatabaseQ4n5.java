package classes;

public class DatabaseQ4n5 {

    private Integer port;
    private String name;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connected to database");
        Thread.sleep(2000L);
    }

    public void disconnect() throws InterruptedException {
        System.out.println("Disconnected from databse");
        Thread.sleep(1000L);
    }

    @Override
    public String toString() {
        return "DatabaseQ4n5{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
