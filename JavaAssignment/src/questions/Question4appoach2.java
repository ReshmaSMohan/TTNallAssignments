package questions;

import java.util.Scanner;

public class Question4appoach2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int lower = 0, upper = 0, digit = 0, spl = 0;
        System.out.print("Enter the original string : ");
        str = scanner.nextLine();
        float perc = (str.length());
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i)))
                lower++;
            else if (Character.isUpperCase(str.charAt(i)))
                upper++;
            else if (Character.isDigit(str.charAt(i)))
                digit++;
            else if ((str.charAt(i) > 31) && (str.charAt(i) < 48) || (str.charAt(i) > 90) && (str.charAt(i) < 97) || (str.charAt(i) > 57) && (str.charAt(i) < 65))
                spl++;
        }

        System.out.println("lower:upper:digit:spl");
        System.out.println(lower + "   :   " + upper + "  :  " + digit + "  :  " + spl);
        System.out.println((lower * 100) / perc + "   :   " + (upper * 100) / perc + "  :  " + (digit * 100) / perc + "  :  " + (spl * 100) / perc);

    }
}
