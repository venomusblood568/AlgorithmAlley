public class Count_Subarray_sum_Equals_K {
    public static int findallsubarraywithgivensum(int arr[],  int k){
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n ; i++){
            for(int j = i; j <n; j++){
                int sum = 0;
                for( k = i; k <= j; k++){
                    sum += arr[k];
                if (sum == k)
                    count++;
                }

            }
        }return count;
    }
    public static void main(String[] args){
        int[] arr = {3,1,2,4};
        int k = 6;
        int count = findallsubarraywithgivensum(arr,k);
        System.out.println("The number of subarrays is: " + count);
    }
}
