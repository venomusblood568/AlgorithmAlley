public class longest_subarray_sum_k_positve_negative_sol1 {
    public static int getlongestsubarray(int[] a , int k){
        int n = a.length;
        int len = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int s = 0;
                for(int K = i; K<= j; K++){
                    s += a[K];
                }
                if (s == k)
                    len = Math.max(len, j-i+1);
            }
        }
        return  len;
    }
    public static void main(String[] args){
        int[] a = {-1,1,1};
        int k = 1;
        int len = getlongestsubarray(a,k);
        System.out.println("the length of the longest subarray is :" + len);
    }
}
