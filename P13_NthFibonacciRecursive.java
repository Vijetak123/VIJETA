import java.util.Scanner;

public class P13_NthFibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();


        long nthFibonacci = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);
        sc.close();
}


  public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}    