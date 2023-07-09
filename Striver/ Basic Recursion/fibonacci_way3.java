public class fibonacci_way3 {
    public static int fibonacci(int n){
        //base condition
        if (n <= 1) {
            return n;
        }
        // problem broken down into 2 functional calls
        //and their result combines and returned
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);
        int i = last + slast;
        return i;
    }
    public static void main(String args[]){
        //here lets take the value of N to be 4
        int n = 4;
        System.out.println(fibonacci(n));
    }
}
