package questions;

import java.sql.SQLOutput;

public class Q10Class {
    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void multiply(float a, float b) {
        System.out.println(a * b);
    }

    public static void concatString(String s1, String s2) {
        System.out.println(s1.concat(s2));
    }

    public static void concatString(String s1, String s2, String s3) {
        System.out.println((s1.concat(s2)).concat(s3));
    }
}
