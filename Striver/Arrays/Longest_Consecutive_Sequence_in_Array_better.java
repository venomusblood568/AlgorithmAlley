import java.util.*;
public class Longest_Consecutive_Sequence_in_Array_better {
    public static int longestsuccessiveelement(int[] a){
        int n = a.length;
        if(n == 0) return 0;

        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;

        for(int i = 0; i < n; i++){
            if(a[i] -1 == lastSmaller){
                count += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                    count = 1;
                    lastSmaller = a[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args){
        int[] a = {100,200,1,2,3,4};
        int ans = longestsuccessiveelement(a);
        System.out.println("the longest consecutive squece is: "+ ans);
    }
}
