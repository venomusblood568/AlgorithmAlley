import java.io.*;
import java.util.*;

public class Solution {

    // Function to find the length of the longest consecutive sequence
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // Initialize variables to keep track of the maximum length and the current length
        int max = 1;
        int currentLength = 1;

        // Iterate through the sorted array
        for (int i = 1; i < arr.length; i++) {
            // If the current element is equal to the previous one, skip to the next iteration
            if (arr[i - 1] == arr[i]) {
                continue;
            }

            // If the current element is one more than the previous one, increment the current length
            if (arr[i - 1] + 1 == arr[i]) {
                currentLength++;

                // If the current length is greater than the maximum length, update the maximum length
                if (currentLength > max) {
                    max = currentLength;
                }
            } else {
                // If the current element is not consecutive, reset the current length to 1
                currentLength = 1;
            }
        }

        // Return the maximum length of the consecutive sequence
        return max;
    }
}
