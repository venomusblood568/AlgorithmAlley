// sum of n number using function
//time complexity = O(N)
//space complexity = O(N)
public class sumofn_function {
    public static void main(String args[]){
        int n = 3;
        System.out.println(function(n));
    }
    public static int function(int n){
        if(n==0){
            return n;
        }
        return n + function(n-1);
    }
}
//parameterized recursion. We can visualize the sum of n natural numbers in the following way as shown below:
//
//sumOfNaturalNumbers(N) = N + sumOfNaturalNumbers(N-1);
//The Sum of N natural numbers would just be the Nth integer added to the Sum of (N-1) natural numbers.
// The base case can be visualized as if n decreases to 0, then we return 0 because the sum of 0 natural numbers is 0 only.
// Here, we’ve just broken the problem into 2 subparts and the answers of both these subparts would be added and stored in the Sum(n) function which would then be printed at last.