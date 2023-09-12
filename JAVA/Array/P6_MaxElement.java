//Find the maximum element in an array.

import java.util.Scanner;

public class P6_MaxElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter the elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is : " + max);
        s.close();
    }
}
