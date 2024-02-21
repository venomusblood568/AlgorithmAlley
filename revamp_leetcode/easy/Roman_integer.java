import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0; // Initialize a variable to store the result
        for(int i = 0; i < s.length(); i++){ // Iterate through each character of the input string
            char c = s.charAt(i); // Get the current character
            if(i < s.length()-1 && map.get(c) < map.get(s.charAt(i + 1))){ // Check if the current character represents a subtractive case
                // If it does, subtract the value of the current character from the value of the next character and add the result to sum
                sum += map.get(s.charAt(i+1)) - map.get(c);
                i++; // Skip the next character since it's already processed
            }
            else{
                // If it's not a subtractive case, simply add the value of the current character to sum
                sum += map.get(c);
            }
        }
        return sum; // Return the final result
    }
}
