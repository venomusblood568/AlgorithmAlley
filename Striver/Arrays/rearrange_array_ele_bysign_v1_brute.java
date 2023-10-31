import java.util.*;
public class rearrange_array_ele_bysign_v1_brute {
    public static int[] Rearrangebysign(int[] A, int n){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i = 0; i <n; i++){
            if(A[i] > 0) pos.add(A[i]);
            else neg.add(A[i]);
        }
        for(int i = 0; i < n/2; i++){
            A[2*i] = pos.get(i);
            A[2*i+1] = neg.get(i);
        }
        return A;
    }
    public static void main(String[] args){
        int n = 4;
        int A[] = {1,2,-3,-6};
        int[] ans = Rearrangebysign(A,n);
        for (int i= 0; i <n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
