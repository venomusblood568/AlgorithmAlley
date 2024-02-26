class Solution {
    public int fib(int n) {
       if (n <= 1) {
           return n;
       }

       int a = 0;
       int b = 1;
       int result = 0;

       for(int i = 2; i <= n; i++){
           result = a+b;
           a = b;
           b = result;
       }
       return result;
    }
}
