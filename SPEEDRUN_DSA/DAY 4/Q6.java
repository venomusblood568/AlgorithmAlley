import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		int temp[] = new int[26];
		int j = 0;
		int i = 0;
		int max = 0;
		while(j < input.length()){
			while(temp[input.charAt(j)-'a']!=0){
				temp[input.charAt(i++)-'a']--;
			}
			temp[input.charAt(j)-'a']++;
			max = Math.max(j-i+1,max);
			j++;
		}
		return max;
	}
}
