public class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of all elements in the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Calculate the right sum (total sum - left sum - current element)
            int rightSum = totalSum - leftSum - nums[i];
            
            // Check if the left sum equals the right sum
            if (leftSum == rightSum) {
                return i; // Return the current index as pivot index
            }
            
            // Update the left sum by adding the current element
            leftSum += nums[i];
        }

        // If no pivot index is found, return -1
        return -1;
    }
}
