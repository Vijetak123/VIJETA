import java.util.Scanner;

public class P16_AreaOfCircleRecursive {
    public static void main(String[] args) {
        double area, r = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        r = sc.nextDouble();

        area = findArea(r);
        System.out.println("Area of a circle is " + area);

        sc.close();
    }

    public static double findArea(double r){
        if (r <= 0) {
            return 0;
        } else {
            return 3.14 * r * r;
        }
    }
}
