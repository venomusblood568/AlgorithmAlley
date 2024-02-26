import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Square each element
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        // Sort the squared values using Arrays.sort()
        Arrays.sort(nums);
        
        return nums;
    }
}
