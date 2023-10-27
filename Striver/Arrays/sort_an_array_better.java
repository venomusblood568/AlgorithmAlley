import java.util.ArrayList;
import java.util.Arrays;

public class sort_an_array_better {
    public static void sorteaaya(ArrayList<Integer> arr, int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) count0++;
            else if (arr.get(i) == 1) count1++;  // Fix: Check for 1 instead of 0 in the second if statement
            else count2++;
        }
        for (int i = 0; i < count0; i++) arr.set(i, 0);
        for (int i = count0; i < count0 + count1; i++) arr.set(i, 1);
        for (int i = count0 + count1; i < n; i++) arr.set(i, 2);
    }

    public static void main(String[] args) {
        int n = 5; // Corrected size of the input array
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{0, 2, 1, 2, 0}));
        sorteaaya(arr, n);
        System.out.println("After sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " "); // Use print instead of println to print on the same line
        }
        System.out.println(); // Add a new line after printing the sorted array
    }
}
