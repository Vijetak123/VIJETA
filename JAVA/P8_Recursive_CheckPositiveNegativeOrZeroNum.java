import java.util.Scanner;

public class P8_Recursive_CheckPositiveNegativeOrZeroNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        String result = checkNum(num);
        System.out.println("Number is " + result);
        sc.close();
    }

    public static String checkNum(int num){
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}
