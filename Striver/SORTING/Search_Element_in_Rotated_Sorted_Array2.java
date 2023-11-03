public class Solution {
    public static boolean searchInARotatedSortedArrayII(int[] A, int key) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            if (A[i] == key) {
                return true;
            }
        }

        return false;
    }
}
