// Write a Optimized program to find the largest of three numbers.

import java.util.Scanner;

public class P5_OptimizedLargestOfThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  numbers: ");
        double num1 = scanner.nextDouble();

        double num2 = scanner.nextDouble();

        double num3 = scanner.nextDouble();

        double largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}

