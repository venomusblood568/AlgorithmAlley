public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Create an array to store the final results
        int[] result = new int[n];
        
        // Initialize the result array with 1s
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        
        // Calculate the product of all elements to the left of each element
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= leftProduct;
            leftProduct *= nums[i];
        }
        
        // Calculate the product of all elements to the right of each element
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }
}
