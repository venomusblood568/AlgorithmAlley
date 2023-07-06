// sum of n number using loop
//time complexity = O(N)
//space complexity = O(1)
public class sum_of_n_loop{
    public static void solve(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println("the sum of first" + n + "number is " + sum );
    }
    public static void main(String[] args){
        solve(5);
    }
}
