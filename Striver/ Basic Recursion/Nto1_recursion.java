public class Nto1_recursion {
    static void function(int i,int n){
        if (i < 1)return;
        System.out.println(i);
        function(i-1,n);
    }
    public static void main (String[] args){
        int n = 4;
        function(n,n);
    }
}

