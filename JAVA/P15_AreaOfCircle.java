//Write a program to calculate the area of a circle.

import java.util.Scanner;

public class P15_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, radius = 0, pi = 3.14;
        System.out.println("Enter Radius: ");
        radius = sc.nextDouble();

        area = pi * radius * radius;
        System.out.println("Area od a Circle is " + area);
        sc.close();
    }
}
