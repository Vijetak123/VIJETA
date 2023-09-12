//Find the index of the first occurrence of a specific value in an array.

import java.util.Scanner;

public class P11_IndexOfFirstOccurenceSpecificValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        
        System.out.println("Enter Target Value: ");
        int targetValue = s.nextInt();

        int index = findValueOfIndex(arr, targetValue);

        if (index != -1) {
            System.out.println("Index of first occurence of " + targetValue + " is " + index);
        } else {
            System.out.println("Index of "+ targetValue + " not found");
        }
        
        s.close();
    }


    public static int findValueOfIndex(int[] arr, int targetValue){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }
}
