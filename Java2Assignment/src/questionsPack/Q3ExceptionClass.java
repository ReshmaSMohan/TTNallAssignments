package questionsPack;

// 3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

public class Q3ExceptionClass {

    public static void main(String[] args) {

        Q2SortingWithoutStringMethod obj = new Q2SortingWithoutStringMethod();


        /*
         * now delete Q2SortingWithoutStringMethod.class from out package.
         * then java.lang.NoClassDefFoundError: is raised.
         * */

        ////////////////////////////////////////////////////////////////

        /*
         * while trying to load jdbc driver class, the class will not be found in specified path
         * then java.lang.ClassNotFoundException: is raised.
         * */
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
