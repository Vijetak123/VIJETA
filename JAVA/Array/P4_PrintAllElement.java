//Print all the elements of an array.


import java.util.Scanner;

public class P4_PrintAllElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}
