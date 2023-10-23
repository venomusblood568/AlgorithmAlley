import java.util.*;
public class missing_num_array_optimal {
    public static int missingnumber(int[] a, int n){
        // summation of first N number;
        int sum = (n *(n+1))/2;
        // summation of all array number
        int s2 = 0;
        for(int i = 0; i < n-1; i++){
            s2 += a[i];
        }
        // missing number is the difference between the sum of first N natural number
        // the sum of the array number
        int missingnum = sum - s2;
        return missingnum;
    }
    public static void main(String[] args){
        int n = 5;
        int a[] = {1,2,4,5};

        // call the missingnumber function and print the result
        int ans = missingnumber(a,n);
        System.out.println(ans);
    }
}
