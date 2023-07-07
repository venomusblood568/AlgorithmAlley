//factorial of a number using loop
public class factorial_num {
    public static void main (String args[]){
    int n = 5;
    System.out.println(fact(n));
    }
    public static int fact(int n){
        int ans = 1;
        for (int i = 1; i<= n;i++){
            ans = ans * i;
        }
        return ans;
    }

}
