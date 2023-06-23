public class o1_n_backtracking {
    public static void main(String[] args){
        int n = 4;
        counter(n);
    }
    public static void counter(int n){
        if (n == 0){
            return;
        }
        else {
            counter(n-1);
            System.out.println(n);
        }
    }
}
