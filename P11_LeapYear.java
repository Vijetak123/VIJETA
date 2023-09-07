import java.util.Scanner;

public class P11_LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        if (year % 100 == 0) {
            System.out.println("Centuary Year.");
            if (year % 400 == 0) {
                System.out.println("Leap Year.");
            } else {
                System.out.println("Not a Leap Year.");
            }
        } else {
            System.out.println("Not a Centuary year.");
            if (year % 4 == 0) {
                System.out.println("Leap Year.");
            } else {
               System.out.println("Not a Leap Year.");  
            }
            
        }
          sc.close();
    }
}
