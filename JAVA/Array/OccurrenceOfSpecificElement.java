import java.util.Scanner;

public class OccurrenceOfSpecificElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter Target Value:");
        int targetValue = s.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                count++;
            }
        }

        System.out.println("Occurence of " + targetValue + " is " + count);
        s.close();
    }
}
