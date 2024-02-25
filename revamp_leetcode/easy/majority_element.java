class Solution {
    public int majorityElement(int[] nums) {
       int majorityelement = nums[0];
       int counter = 0;

       for(int i = 0; i <nums.length; i++){
           if(counter == 0){
               majorityelement = nums[i];
               counter = 1;
           }
           else if (nums[i] == majorityelement){
               counter++;
           }
           else{
               counter--;
           }
        } 
        return majorityelement;
    }
}
