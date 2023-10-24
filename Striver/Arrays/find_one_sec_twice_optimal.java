import java.util.*;
public class find_one_sec_twice_optimal {
    public static int getsingle_element(int[] arr){
        int n = arr.length;
        int xor = 0;
        for(int i = 0; i<n; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String args[]){
        int[] arr = {4,1,2,1,2};
        int ans = getsingle_element(arr);
        System.out.println("the single element is "+ ans);
    }
}
