package questions;

import java.util.HashMap;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[4];
        int count;

        System.out.print("Enter 5 elements of first array : ");
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = scanner.nextInt();

        System.out.print("Enter 4 elements of second array : ");
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = scanner.nextInt();

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            count = 0;
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    hashMap.put(arr1[i], ++count);
                }
            }
        }

        /*The key is element repeated and the value is number of times it is repeated */
        System.out.print(hashMap);
    }
}
