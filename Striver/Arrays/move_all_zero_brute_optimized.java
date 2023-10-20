import java.util.*;
public class move_all_zero_brute_optimized {
    public static int[] movezeros(int n, int[] a){
        int j = -1;
        //place the pointer j;
        for(int i = 0; i < n ; i++){
            if(a[i] == 0){
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,0,2,3,0,0,4,1};
        int n = 10;
        int[] ans = movezeros(n,arr);
        for(int i = 0; i <n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println(" ");
    }
}
