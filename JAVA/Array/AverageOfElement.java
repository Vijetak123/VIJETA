//Calculate the average of elements in an array.

import java.util.Scanner;

public class AverageOfElement {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Average of the elements are: " + (sum/arr.length));
        s.close();
    }
}
