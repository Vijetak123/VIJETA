// Write a program to check if a number is even or odd.

import java.util.Scanner;

public class P6_EvenOrOddNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else{
            System.out.println("Number is Odd");
        } 
        sc.close();
    }
}