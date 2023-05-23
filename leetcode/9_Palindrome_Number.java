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

/*
//easy way 
//combined all the condition in one place
class Solution {
    public boolean isPalindrome(int x) {
        int k=x;
        int s=0;
            while(k>0){
            s=k%10+s*10;
            k/=10;
            }
        return s==x;
    }
}
*/
