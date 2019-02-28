
/*
 Implement multiple inheritance with default method inside  interface.
*/

interface Q7Interface1 {
    default void defaultMethod() {
        System.out.println("Default method of interface 1");
    }
}

interface Q7Interface2 {
    default void defaultMethod() {
        System.out.println("Default method of interface 2");
    }
}


public class Q7MultipleInheritanceWithDefaultMethod implements Q7Interface1,Q7Interface2{

    @Override
    public void defaultMethod() {
        Q7Interface1.super.defaultMethod();
        Q7Interface2.super.defaultMethod();
        System.out.println("Overriden default method of class");
    }

    public static void main(String[] args) {
        new Q7MultipleInheritanceWithDefaultMethod().defaultMethod();


    }
}
