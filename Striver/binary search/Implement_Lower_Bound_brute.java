public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        for (int i = 0; i < n; i++){
            if(arr[i] >= x){
                return i;
            }
        }return n;
    }
}
