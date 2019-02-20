package questions;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[5];

        System.out.print("Enter 5 elements of array : ");
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = scanner.nextInt();
        int i, once = arr1[0];

        for (i = 1; i < arr1.length; i++) {
            once = once ^ arr1[i];
        }

        System.out.println("Not repeated array element : " + once);

    }

}