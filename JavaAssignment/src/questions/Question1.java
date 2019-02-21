package questions;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString, subString, newString;

        System.out.print("Enter the original string : ");
        firstString = scanner.nextLine();

        System.out.print("Enter the sub string to be replaced : ");
        subString = scanner.nextLine();

        System.out.print("Enter the new string to be merged : ");
        newString = scanner.nextLine();

        System.out.println(firstString.replaceAll("/a.*/", newString));
        System.out.println(firstString);

        System.out.println(firstString.replace(subString, newString));
    }
}
