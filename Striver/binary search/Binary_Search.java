public class Solution {
    public static int binarySearch(int[] arr, int low ,int high , int target) {
        if (low > high){
            return -1;
        }
        int mid = (low + high)/2;
        
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]){
            return binarySearch(arr, mid + 1, high, target);
        }
        else{
            return binarySearch(arr,low,mid-1,target);
        }
    }
    public static int search(int[]nums,int target){
        int low = 0;
        int high = nums.length-1;
        int result = binarySearch(nums,low,high,target);
        return result;
    }
}
