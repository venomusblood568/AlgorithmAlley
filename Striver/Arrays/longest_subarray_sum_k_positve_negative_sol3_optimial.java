import java.util.*;

public class longest_subarray_sum_k_positve_negative_sol3_optimial {
    public static int getlogestsubarray(int[]a,int k){
        int n = a.length;

        Map<Integer,Integer> presummap = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        for(int i = 0; i <n; i++){
            sum += a[i];
            if(sum == k){
                maxlen = Math.max(maxlen,i+1);
            }
            int rem = sum - k;

            if(presummap.containsKey(rem)){
                int len = i - presummap.get(rem);
                maxlen = Math.max(maxlen,len);
            }
            if (!presummap.containsKey(sum)){
                presummap.put(sum,i);
            }
        }
        return maxlen;
    }
    public static void main(String[] args){
        int[] a = {-1,1,1};
        int k = 1;
        int len = getlogestsubarray(a,k);
        System.out.println("the length of the longest subarray: "+ len);
    }
}
