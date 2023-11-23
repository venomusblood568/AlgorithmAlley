import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

    // Function to find the length of the longest subset with zero sum
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

        // Get the size of the input array
        int n = arr.size();

        // Create a HashMap to store the cumulative sum and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize variables to keep track of the current sum, maximum length, and current length
        int sum = 0;
        int max = 0;
        int currentLength = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Update the cumulative sum
            sum += arr.get(i);

            // Check if the current sum has been seen before
            if (map.containsKey(sum)) {
                // If yes, update the current length
                currentLength = i - map.get(sum);
            } else {
                // If not, add the current sum and its index to the map
                map.put(sum, i);
            }

            // Check if the current sum is zero, update the length accordingly
            if (sum == 0) {
                currentLength = i + 1;
            }

            // Update the maximum length
            max = Math.max(max, currentLength);
        }

        // Return the maximum length of the subset with zero sum
        return max;
    }
}
