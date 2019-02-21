package questionsPack;

public class Q11 {

    public static void main(String[] args) {
        int s = 0;
        int t = 1;
        for (int i = 0; i < 10; i++) {
            s = s + i;
            for (int j = i; j > 0; j--) {
                t = t * (j - i);
            }
            s = s * t;

            System.out.print("T is " + t);
        }
        System.out.print("S is " + s);
        System.out.println("\n==================================================================");

        //using while
        int i = 0, j;
        s = 0;
        t = 1;
        while (i < 10) {
            s = s + i;
            j = i;
            while (j > 0) {
                t = t * (j - i);
                j--;
            }
            s = s * t;

            System.out.print("T is " + t);
            i++;
        }
        System.out.print("S is " + s);
    }
}
