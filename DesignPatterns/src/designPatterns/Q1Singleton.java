package designPatterns;

public class Q1Singleton {
    static Q1Singleton singleton = null;
    String name;

    private Q1Singleton() {

        try {
            Thread.sleep(400L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        name = "singleton class variable";
    }

    public static Q1Singleton getInstance() {
        if (singleton == null)
            singleton = new Q1Singleton();
        return singleton;
    }

    @Override
    public String toString() {
        return "Q1Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Main1 {
    public static void main(String[] args) {

        System.out.println(Q1Singleton.getInstance());
        System.out.println(Q1Singleton.getInstance());
    }
}
