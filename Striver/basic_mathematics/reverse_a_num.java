public class reverse_a_num {
    static int reverse(int n) {
        int reversed = 0;
        while( n != 0){
            int last_digit = n % 10;
            reversed = reversed * 10 + last_digit;
            n /= 10;

        }
        return reversed ;
    }

    public static void main(String args[]) {

        int n    = 1432;
        System.out.println(reverse(n));
    }
}
