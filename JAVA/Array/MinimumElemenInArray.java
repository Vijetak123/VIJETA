//Find the minimum element in an array.

public class MinimumElemenInArray {
    public static void main(String[] args) {
        
        int arr[] ={5,8,2,4,1};
        
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }
}
