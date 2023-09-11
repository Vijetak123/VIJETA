import java.util.Scanner;

public class MultiplyFloatingPointNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float product = num1 * num2;

        System.out.println("Product is " + product);
        sc.close();
    }
}


