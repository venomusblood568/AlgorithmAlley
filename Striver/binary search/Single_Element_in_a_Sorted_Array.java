import java.util.ArrayList;

public class Solution {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int n = arr.size();

        if (n == 1) {
            return arr.get(0);
        }

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the single non-duplicate element
            if (mid % 2 == 0) {
                if (mid + 1 < n && arr.get(mid).equals(arr.get(mid + 1))) {
                    low = mid + 2;
                } else if (mid - 1 >= 0 && arr.get(mid).equals(arr.get(mid - 1))) {
                    high = mid - 2;
                } else {
                    return arr.get(mid);
                }
            } else {
                if (mid - 1 >= 0 && arr.get(mid).equals(arr.get(mid - 1))) {
                    low = mid + 1;
                } else if (mid + 1 < n && arr.get(mid).equals(arr.get(mid + 1))) {
                    high = mid - 1;
                }
            }
        }

        return -1; // Not found (should not happen if input is valid)
    }
}
