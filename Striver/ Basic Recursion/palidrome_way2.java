public class palidrome_way2 {
    static boolean palidrome(int i , String s){
        //base condition
        //if i exceeds half of the string, means all the elements
        //are compared, we return true;
        if(i >= s.length()/2) return true;
        //if start is not equal to end, not palindrome.
        if (s.charAt(i) != s.charAt(s.length()-i-1))return false;
        //if both characters are same, increament i and check start+1 and end-1
        return palidrome(i+1,s);
    }
    public static void main(String args[]){
        //Example string
        String s = "madam";
        System.out.println(palidrome(0,s));
    }
}
