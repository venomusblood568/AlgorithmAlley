import java.util.* ;
import java.io.*; 
public class Solution {
    static int floor (int n, int x, int[]arr){
        int ans = -1;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start+end)/2;
            if (arr[mid] <= x){
                ans = Math.max(ans,arr[mid]);
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }return ans;
    }

    static int ceil(int n , int x, int[]arr){
        if(x >arr[n-1]) return -1;
        int ans = integer.MAX_VALUE;
        int start = 0;
        int end = n-1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if (arr[mid] >=x){
                ans = Math.min(ans,arr[mid]);
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }return ans;
    }
    
    
    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        Arrays.sort(arr);

        int floor_of_array = floor(n,x,arr);       

        int ceil_of_array = ceil(n,x,arr);

 

        System.out.print(floor_of_array+" ");

 

        return ceil_of_array;
    }
}
