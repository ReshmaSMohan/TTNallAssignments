package questionsPack;

// 4. WAP to create singleton class.

public class Q4Singleton {

    public static Q4Singleton singleton = null;
    public String name;

    private Q4Singleton() {
        name = "singleton class variable";
    }

    public static Q4Singleton createInstance() {
        if (singleton == null)
                singleton = new Q4Singleton();
        return singleton;
    }
}

class Main {
    public static void main(String[] args) {
        Q4Singleton newSingleton = Q4Singleton.createInstance();
        Q4Singleton newSingleton2 = Q4Singleton.createInstance();
        System.out.print("content in object 1                                --->  ");
        System.out.println(newSingleton.name);

        newSingleton2.name = newSingleton2.name.concat(" : content added by object 2");
        System.out.print("content modified in object 2                       --->  ");
        System.out.println(newSingleton2.name);
        System.out.print("content in object 1 after modification by object 2 --->  ");
        System.out.println(newSingleton.name);


    }
}
