class Solution {
    public void moveZeroes(int[] nums) {
        int nonzerosindex = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0 ){
                int temp = nums[nonzerosindex];
                nums[nonzerosindex] = nums[i];
                nums[i] = temp;
                nonzerosindex++;
            }
        }
    }
}
