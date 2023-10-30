public class Kadanes_Algorithm_brute {
    public static int maxsubarraysum(int[] arr, int n ){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i <n ; i++){
            for(int j = 0; j <n;j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                maxi = Math.max(maxi,sum);
            }
        }
        return maxi;
    }
    public static void main(String[] args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxsum = maxsubarraysum(arr,n);
        System.out.println("The maximum subarray sum is: "+ maxsum);
    }
}
