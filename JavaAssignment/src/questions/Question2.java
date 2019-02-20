package questions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int index = 0, count = 0, i = 0;
        Scanner scanner = new Scanner(System.in);

        String str;
        System.out.print("Enter the original string : ");
        str = scanner.nextLine();

        String dupword;
        System.out.print("Enter the duplicate word to search : ");
        dupword = scanner.next();

        while (index > -1) {
            index = str.indexOf(dupword, i);
            i = index + dupword.length();
            if (index != -1)
                count++;
        }

        System.out.println("count of repearated : " + count);
    }
}
