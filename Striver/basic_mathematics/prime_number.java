public class prime_number {

    public static boolean is_prime(int n){
        for(int i = 2; i<n;i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n = 9;
        boolean answer = (is_prime(n));
        if (n != 1 && answer == true){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}

