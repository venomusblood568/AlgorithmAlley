// sum of n number using parameterized way
//time complexity = O(N)
//space complexity = O(N)
public class sumofn_parmeter {
    public static void function(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        function(i-1,sum+i);
    }
    public static void main(String[] args){
       int n = 3;
       function(n,0);
    }
}

//instead of using a global variable for calculating the sum, we pass the sum in the parameters of the function each time we add an integer to it during the function call. The sum gets incremented by an ith integer and i get decremented by 1 in each function call. At the end when i becomes less than 1, we simply return the calculated sum until that point.