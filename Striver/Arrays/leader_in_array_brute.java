import java.util.*;

public class leader_in_array_brute{
    public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        // Array Initialization.
        int n = 6;
        int[] arr = {10, 22, 12, 3, 0, 6};

        ArrayList<Integer> ans = printLeadersBruteForce(arr, n);

        System.out.println("Leaders in the array are: " + ans);
    }
}
