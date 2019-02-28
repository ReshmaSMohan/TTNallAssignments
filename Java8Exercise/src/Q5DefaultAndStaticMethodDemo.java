
/*
Create and access default and static method of an interface.
*/

interface Q5Interface{
    default void defaultMethod(){
        System.out.println("Default method of interface");
    }

    static void staticMethod(){
        System.out.println("Static method of interface");
    }
}
public class Q5DefaultAndStaticMethodDemo implements Q5Interface{

    public static void main(String[] args) {

        Q5Interface.staticMethod();
        new Q5DefaultAndStaticMethodDemo().defaultMethod();
    }
}
