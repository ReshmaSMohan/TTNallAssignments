package questions;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        System.out.print("Enter the original string : ");
        str = scanner.nextLine();

        String charToFind;
        System.out.print("Enter the character to search : ");
        charToFind = scanner.next();

        int lengthWithout = str.replaceAll(charToFind, "").length();

        System.out.println(str.length() - lengthWithout);

    }
}
