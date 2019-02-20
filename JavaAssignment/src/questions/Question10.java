package questions;

public class Question10 {
    public static void main(String[] args) {
        int i1 = 1, i2 = 2;
        double d1 = 1.1, d2 = 2.2;
        float f1 = 1.1f, f2 = 4.2f;
        String s1 = "reshma", s2 = "S", s3 = "Mohan";

        System.out.println("calling add using integer");
        Q10Class.add(i1, i2);
        System.out.println("calling add using double");
        Q10Class.add(d1, d2);

        System.out.println("calling multiply using float");
        Q10Class.multiply(f1, f2);
        System.out.println("calling multiply using integer");
        Q10Class.multiply(i1, i2);

        System.out.println("calling concat with 2 args");
        Q10Class.concatString(s1, s3);
        System.out.println("calling concat with 3 args");
        Q10Class.concatString(s1, s2, s3);
    }
}
