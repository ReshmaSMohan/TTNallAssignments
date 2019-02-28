
/*
* Create a functional interface whose method takes 2 integers and return one integer.
* */

@FunctionalInterface
interface FuncInterfaceDemo {

    int interfaceMethod(int a, int b);
}


public class Q2MethodReference {

    int addition(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        /*
         * Using (instance) Method reference create and apply add and subtract method for the functional interface created.
         * */

        FuncInterfaceDemo funcInterfaceDemo = new Q2MethodReference()::addition;
        System.out.println("Instance method reference , addition() : "+funcInterfaceDemo.interfaceMethod(10,20));

        funcInterfaceDemo = new Q2MethodReference()::subtraction;
        System.out.println("Instance method reference , subtraction() : "+funcInterfaceDemo.interfaceMethod(10,20));

        /*
        * using (Static) Method reference create and apply multiplication method for the functional interface created.
        * */

        funcInterfaceDemo = Q2MethodReference::multiply;
        System.out.println("Instance method reference , multiply() : "+funcInterfaceDemo.interfaceMethod(10,20));

        funcInterfaceDemo = Q2MethodReference::division;
        System.out.println("Instance method reference , division() : "+funcInterfaceDemo.interfaceMethod(100,20));


    }

}
