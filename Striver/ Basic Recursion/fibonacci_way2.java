public class fibonacci_way2 {
    public static void main(String args[]){
        int n = 5;
        if (n == 0){
            System.out.println("the fibonacci series up to " + n + "th term");
            System.out.println(0);
        }
        else{
            int secondlast = 0;
            int last = 1;
            System.out.println("the fibonacci series up to "+ n + "th term");
            System.out.println(secondlast + " " + last + " ");
            int cur;
            for (int i = 2; i <= n; i++){
                cur = last + secondlast;
                secondlast = last;
                last = cur;
                System.out.println(cur + " ");
            }
        }

    }
}
