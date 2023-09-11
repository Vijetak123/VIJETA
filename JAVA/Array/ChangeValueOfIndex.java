//Change the value at any index of an array.

import java.util.Scanner;

public class ChangeValueOfIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = {2,9,4,6,1};
        arr[1] = 7;

        System.out.println("Output: " + arr[1]);

        s.close();
    }
}
