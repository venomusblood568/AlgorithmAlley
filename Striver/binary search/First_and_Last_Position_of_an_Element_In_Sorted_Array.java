import java.util.*;

public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // first occurrence
        int low = 0;
        int high = n - 1;
        int firstIndex = -1; // Initialize to -1
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == k) {
                firstIndex = mid;
                high = mid - 1;
            } else if (arr.get(mid) < k) low = mid + 1;
            else high = mid - 1;
        }
        
        // last occurrence
        low = 0;
        high = n - 1;
        int lastIndex = -1; // Initialize to -1
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == k) {
                lastIndex = mid;
                low = mid + 1;
            } else if (arr.get(mid) < k) low = mid + 1;
            else high = mid - 1;
        }

        // Initialize the result array with first and last occurrence indices
        int[] ans = {firstIndex, lastIndex};
        return ans;
    }
}
