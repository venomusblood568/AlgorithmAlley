public class two_sum_way1 {
    public static String twosum(int n, int[] arr, int target){
        for(int i = 0; i <n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args){
        int n = 5;
        int[] arr = {2,6,5,8,11};
        int target = 14;
        String ans  = twosum(n, arr, target);
        System.out.println("this is the answer for varient 1:" + ans);
    }

}
