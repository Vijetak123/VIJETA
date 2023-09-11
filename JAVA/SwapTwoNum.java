import java.util.Scanner;

public class SwapTwoNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n1, n2, n3;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println("Before: ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        n3 = n1;
        n1 = n2;
        n2 = n3;

        System.out.println("After: ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        sc.close();
        
    }
}
