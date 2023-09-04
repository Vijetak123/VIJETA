// Write a Recursive program to find the largest of three numbers.

import java.util.Scanner;

public class P4_Recursive_LargestOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        int largestNum = findLargest(n1, n2, n3);
        System.out.println("Largest number is " + largestNum);
        sc.close();
    }

    public static int findLargest(int n1, int n2, int n3){
        if (n1 >= n2 && n1 >= n3) {
            return n1;
        } else if (n2 >= n1 && n2 >= n3) {
            return n2;
        } else {
            return n3;
        }
    }
}
