class Solution {
    public boolean isPalindrome(int x) {
        // Special case: if x is negative, it cannot be a palindrome
        if (x < 0)
            return false;
        
        // Initialize variables
        int original = x;
        int reversed = 0;
        
        // Reverse the number
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        // Check if the original number equals its reversed version
        return original == reversed;
    }
}
