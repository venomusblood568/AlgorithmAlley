//Certainly! The modified algorithm finds the maximum subarray sum without storing the subarray elements.
//It keeps track of starting index (`start`), ending index (`ansStart`, `ansEnd`), and maximum sum (`maxSum`).
//While iterating through the array, it updates `start` when the sum becomes 0 and updates `ansStart` and `ansEnd` when the sum crosses `maxSum`.
//After the loop, the subarray with the maximum sum is from `ansStart` to `ansEnd`. This approach optimizes space by only storing indices, not elements.

public class Kadanes_Algorithm_follow_up_question {
    public static long maxSubarraysum(int[] arr, int n){
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int start = 0;
        int ans_start = -1;
        int ans_end = -1;
        for(int i = 0; i <n; i++){
            if (sum == 0) start = i; //starting index
            sum  += arr[i];
            if(sum > maxi){
                maxi = sum;
                ans_start = start;
                ans_end = i ;
            }
            if (sum < 0);
            sum = 0;
        }
        System.out.print("the subarray is: [");
        for(int i = ans_start; i <= ans_end; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println("]n");
        return maxi;
    }
    public static void main(String args[]){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        long max_sum = maxSubarraysum(arr,n);
        System.out.println("the maximum subarray sum is: "+ max_sum);
    }

}
