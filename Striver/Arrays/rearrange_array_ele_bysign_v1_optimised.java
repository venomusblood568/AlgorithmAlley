import java.util.*;

public class rearrange_array_ele_bysign_v1_optimised {
    public static ArrayList<Integer> rearrangebysign(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (A.get(i) < 0) {
                ans.set(negIndex, A.get(i));
                negIndex += 2;
            } else {
                ans.set(posIndex, A.get(i));
                posIndex += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 2, -4, -5);
        ArrayList<Integer> ans = rearrangebysign(new ArrayList<>(A));
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
