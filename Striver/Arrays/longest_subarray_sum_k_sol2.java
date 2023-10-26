import java.util.*;

public class longest_subarray_sum_k_sol2 {
    public static long getlongestsubarray(int[] a, long k){
        //size of the array
        int n = a.length;

        Map<Long,Integer> presummap = new HashMap<>();
        long sum = 0;
        long maxlen = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];

            // if the sum is equal to k then update the maxlen:
            if (sum ==k){
                maxlen  = Math.max(maxlen, i+1);
            }
            // for remaining part link x-k
            long rem = sum -k;

            // calculate the length and update maxlen
            if(presummap.containsKey(rem)){
                int len = i - presummap.get(rem);
                maxlen = Math.max(maxlen,len);
            }

            //finally update the map checking the conditions:
            if(!presummap.containsKey(sum)){
                presummap.put(sum,i);
            }

        }
        return maxlen;
    }
    public static void main(String[] args){
        int[] a = {2,3,5,1,9};
        long k = 10;
        long len = getlongestsubarray(a,k);
        System.out.println("the length of the length subarray is : "+ len);
    }
}
