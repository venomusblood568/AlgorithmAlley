import  java.util.*;
public class missing_num_array_better {
    public  static int missing_number(int[] a, int n){
        int Hash[] = new int[n+1];
        for(int i = 0; i <n-1; i++)
            Hash[a[i]]++;
        for (int i = 1; i <= n ; i++){
            if(Hash[i] == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int n = 5;
        int a[] ={1,2,3,4,5};
        int ans = missing_number(a,n);
        System.out.println(ans);
    }
}

// Using N-1 in hash tables ensures that the computed hash code (after modulo operation) maps to a
// valid index within the range [0, N-1]. This prevents out-of-bounds errors, ensuring
// elements are stored within the array's bounds.