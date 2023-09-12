//Access the element at index 3 in an array.

import java.util.Scanner;

public class P2_AccessElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Output :" + arr[2]);
        s.close();
    }
}
