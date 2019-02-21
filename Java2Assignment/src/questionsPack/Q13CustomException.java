package questionsPack;

//Q13. Create a custom exception that do not have any stack trace.

import java.util.Scanner;

public class Q13CustomException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Exception : age is less than  1");
    }
}

class myMain1 {

    public static void main(String[] args) {
        enterAge();
    }

    public static void enterAge() {
        Scanner scanner = new Scanner(System.in);
        Integer age;
        try {
            System.out.print("Enter age : ");
            age = scanner.nextInt();
            if (age < 1)
                throw new Q13CustomException();
        } catch (Q13CustomException customException) {
            customException.printStackTrace();
        }
    }

}
