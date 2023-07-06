// sum of n number using formula
//time complexity = O(1)
//space complexity = O(1)
public class sumofn_formula {
    public static void main(String[] args){
        solve(4);
    }
    public static void solve(int n){
        int sum = n*(n+1)/2;
        System.out.println(sum);
    }
}
