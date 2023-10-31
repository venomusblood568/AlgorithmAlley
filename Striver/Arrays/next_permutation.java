import java.util.*;

public class next_permutation {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int n = permutation.size();
        int ind = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            Collections.reverse(permutation);
            return permutation;
        }

        for (int i = n - 1; i > ind; i--) {
            if (permutation.get(i) > permutation.get(ind)) {
                int temp = permutation.get(i);
                permutation.set(i, permutation.get(ind));
                permutation.set(ind, temp);
                break;
            }
        }
        return permutation;
    }

    public static void main(String[] args) {
        ArrayList<Integer> permutation = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> result = nextPermutation(permutation);
        System.out.println(result);
    }
}
