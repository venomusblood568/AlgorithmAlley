//factorial of a number using formula / recursive
//formula => factorial(N) = N * factorial(N-1);
public class fact_recursive {
    public static void main(String args[]){
        int N = 5;
        System.out.println(fact_formula(N));
    }
    public static int fact_formula(int N){
        if(N==0){
            int y = 1;
            return y ;
        }
        int i = N * fact_formula(N - 1);
        return i;
    }
}
