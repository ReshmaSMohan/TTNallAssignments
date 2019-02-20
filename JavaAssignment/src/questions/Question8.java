package questions;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer str = new StringBuffer();

        System.out.print("Enter the String : ");
        str.append(scanner.nextLine());

        StringBuffer revstr = str.reverse();
        System.out.println(revstr.delete(4, 10));
    }
}
