//Sum all the elements of an integer array.

import java.util.Scanner;

public class SumOfAllElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        int arr[] = new int[5];

        System.out.println("Enter element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all the element of an array is: " + sum);
        s.close();
    }
}
