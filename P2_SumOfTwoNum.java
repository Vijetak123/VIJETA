//Write a program to print the sum of two numbers.


import java.util.Scanner;

public class P2_SumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;

        System.out.println("The sum is " + sum);
        sc.close();
    }
}
