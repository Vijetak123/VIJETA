//Check if an array contains a specific value.

public class P9_CheckArrayContainsSpecificValue {
    public static void main(String[] args) {

        int arr[] = {5,6,8,2,3,9,1};

        int findValue = 7;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Array contains the value : " + findValue);
        } else {
            System.out.println("Array does not contains the value : " + findValue);
        }

    }
}
