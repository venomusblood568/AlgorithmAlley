public class two_sum_way1_varient2{
    public static int[] twosum(int n, int arr[],int target){
        int[] ans = new int[2];
        for(int i =0; i<n;i++){
            for(int j = i+1;j<n; j++){
                ans[0] =i;
                ans[1]= j;
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int n = 5;
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int[] ans = twosum(n,arr,target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                + ans[1] + "]");

    }
}
