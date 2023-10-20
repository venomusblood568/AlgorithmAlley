import java.util.ArrayList;
import java.util.Arrays;

public class move_all_zero_brute {
    // Function to move all zeros to the end of the array
    public static int[] move_zero(int n, int[] a){
        // Create an ArrayList to store non-zero elements
        ArrayList<Integer> temp = new ArrayList<>();

        // Traverse the input array and add non-zero elements to the ArrayList
        for(int i = 0; i < n; i++){
            if(a[i] != 0)
                temp.add(a[i]);
        }

        // Get the number of non-zero elements
        int non_zero = temp.size();

        // Copy non-zero elements back to the original array
        for(int i = 0; i < non_zero; i++){
            a[i] = temp.get(i);
        }

        // Fill the remaining elements with zeros
        for(int i = non_zero; i < n; i++){
            a[i] = 0;
        }

        // Return the modified array
        return a;
    }

    // Main method to test the function
    public static void main(String[] args){
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;

        // Call the move_zero function and print the modified array
        int[] ans = move_zero(n, arr);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println(" ");
    }
}
