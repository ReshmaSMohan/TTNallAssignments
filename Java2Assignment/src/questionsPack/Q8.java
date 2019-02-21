package questionsPack;

/*
8. WAP to read words from the keyboard until the word done is entered.
For each word except done, report whether its first character is equal to its last character.
*/

import java.util.Scanner;

public class Q8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String word = "--";
        System.out.print("Enter word : ");
        word = scanner.next();
        word = word.toLowerCase();
       // usindWhile(word);
       // System.out.println("============");
        usingDoWhile(word);
    }

    public static void usindWhile(String word) {

        while (!word.equals("done")) {

            if (word.charAt(0) == word.charAt(word.length() - 1))
                System.out.println("first and last character are equal");
            else
                System.out.println("first and last character are not equal");
            System.out.print("Enter word : ");
            word = scanner.next();
            word = word.toLowerCase();
        }
        System.out.println("out of while");

    }

    public static void usingDoWhile(String word) {
        //System.out.println(word);
        do {
            if (word.equals("done"))
                break;
            if (word.charAt(0) == word.charAt(word.length() - 1))
                System.out.println("first and last character are equal");
            else
                System.out.println("first and last character are not equal");
            System.out.print("Enter word : ");
            word = scanner.next();
            word = word.toLowerCase();
        } while (!word.equals("done"));
        System.out.println("out of do while");
    }

}
