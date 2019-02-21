package questionsPack;

// 6. WAP showing try, multi-catch and finally blocks.

public class Q6TryCatchFinally {

    public static void main(String[] args) {

        System.out.println(tryCatchReturnStatemnt(10,0));
        System.out.println("=====================================================================");
        System.out.println(tryCatchFinallyReturnStatemnt(10,0));
        System.out.println("=====================================================================");
        multipleCatch(10,0);
    }

    public static String tryCatchReturnStatemnt(int a,int b) {

        try {
            System.out.println("Enter try block");
            int c = a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Enter catch block");
            System.out.println(exception.getMessage());
            return "Returned From Catch as no return statement in finally";
        } finally {
            System.out.println("Enterd finally block");
        }

        return "return from outside try-catch-finally";
    }

    public static String tryCatchFinallyReturnStatemnt(int a,int b) {

        try {
            System.out.println("Enter try block");
            int c = a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Enter catch block");
            System.out.println(exception.getMessage());
            return "Returned From Catch";
        } finally {
            System.out.println("Enterd finally block");
            return "Returned From Finally... return statement of catch ignored";
        }

        //here no return statement as it is unreachable statement
    }

    public static void multipleCatch(int a,int b){

        try {
            System.out.println("Enter try block of multiple catch method");
            int c = a / b;
        }
        catch (ArithmeticException exception) {
            System.out.println("Enter Arithmetic catch block");
        }

    /*  as IntelliJ is smart enough it gives error
        if we place ArithmeticException below the Exception catch block
   */
        catch (Exception exception){
            System.out.println("Enter Arithmetic catch block");
        }

        finally {
            System.out.println("Enterd finally block");
        }
    }
}
