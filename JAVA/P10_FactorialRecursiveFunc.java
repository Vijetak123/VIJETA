import java.util.Scanner;

public class P10_FactorialRecursiveFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        
        int fact = 0;
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        fact = factorial(num);

        System.out.println("Factorial of " + num + " is " + fact);

        sc.close();
    }

    public static int factorial(int n){
       if (n == 0) {
        return 1;
       } else {
        return(n * factorial(n - 1));
       }
    }
}
