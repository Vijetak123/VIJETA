// Write a program to find the largest of three numbers.(Naive Solution)
import java.util.Scanner;

public class P3_LargestOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1, n2, n3 :");
        int n1, n2, n3;
         
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("Largest is " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("Largest is " + n2);
        } else {
            System.out.println("Largest is " + n3);
        }
        sc.close();

    }
}
