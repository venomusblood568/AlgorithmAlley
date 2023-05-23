class Solution {
    public boolean isPalindrome(int x){
       if (x < 0) return false;
       int rev = 0, remainder, original = x;
       while(x != 0){
           remainder = x % 10;
           rev = rev * 10 + remainder;
           x = x/10;
       }
       return original == rev;
    } 
}
