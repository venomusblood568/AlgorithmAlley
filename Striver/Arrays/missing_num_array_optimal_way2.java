// XOR APPROACH
import java.util.*;
public class missing_num_array_optimal_way2 {
    public static int missing_number(int[] a, int n){
        int xor1 = 0;
        int xor2 = 0;

        for(int i= 0; i < n-1; i++){
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }
    public static void main(String[] args){
        int n = 5;
        int a[] = {1,2,3,4};
        int ans = missing_number(a,n);
        System.out.println(ans);
    }
}
