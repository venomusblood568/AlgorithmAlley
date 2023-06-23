public class N_name_recursion {
    static void function(int i, int n){
        //base conditions
        if(i>n){
            return;
        }
        System.out.println("DIE");
        function(i+1,n);
    }
    public static void main (String[] args){
        int n = 4;
        function(1,n);
    }
}
