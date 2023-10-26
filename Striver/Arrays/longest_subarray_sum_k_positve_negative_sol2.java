public class longest_subarray_sum_k_positve_negative_sol2 {
    public static int getLongestsubarray(int[]a, int k ){
        int n = a.length;
        int len = 0;
        for(int i = 0; i < n; i++){
            int s = 0;
            for(int j = i; j<n; j++){
                s += a[j];
                if(s == k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args){
        int [] a = {-1,1,1};
        int k = 1;
        int len = getLongestsubarray(a,k);
        System.out.println("the length of the longest: "+ len);
    }
}
