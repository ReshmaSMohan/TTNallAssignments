package questions;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int lower = 0, upper = 0, digit = 0, spl = 0;
        System.out.print("Enter the original string : ");
        str = scanner.nextLine();
        float perc = (str.length());
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) > 96) && (str.charAt(i) < 123))
                lower++;
            else if ((str.charAt(i) > 64) && (str.charAt(i) < 91))
                upper++;
            else if ((str.charAt(i) > 47) && (str.charAt(i) < 58))
                digit++;
            else //if ((str.charAt(i) > 31) && (str.charAt(i) < 48) || (str.charAt(i) > 90) && (str.charAt(i) < 97) || (str.charAt(i) > 57) && (str.charAt(i) < 65))
                spl++;
        }

        System.out.println("lower:upper:digit:spl");
        System.out.println(lower + "   :   " + upper + "  :  " + digit + "  :  " + spl);
        System.out.println((lower * 100) / perc + "   :   " + (upper * 100) / perc + "  :  " + (digit * 100) / perc + "  :  " + (spl * 100) / perc);

    }
}
