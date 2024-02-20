class Solution {
    public static boolean isPalindrome(int number) {
        String original = String.valueOf(number);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}
