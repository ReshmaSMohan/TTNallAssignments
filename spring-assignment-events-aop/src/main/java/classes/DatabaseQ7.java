package classes;

public class DatabaseQ7 {
    public void connect() {
        System.out.println("Connected to database");
    }

    public void disconnect() {
        System.out.println("Disconnected from databse");
    }

    public void agrIntegerMethod(Integer value) {
        System.out.println("Integer argument method - " + value);
    }

    //question 9
    public void agrMethod(Integer value, Integer value1) {
        System.out.println("Integer argument method - " + value + " " + value1);
    }
}
