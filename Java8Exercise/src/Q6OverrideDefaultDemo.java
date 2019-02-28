
/*
 Override the default method of the interface.
*/

interface Q6Interface {
    default void defaultMethod() {
        System.out.println("Default method of interface");
    }
}

public class Q6OverrideDefaultDemo implements Q6Interface {

    @Override
    public void defaultMethod() {
        System.out.println("Default method overriden by class");
    }

    public static void main(String[] args) {
        new Q6OverrideDefaultDemo().defaultMethod();
    }
}
