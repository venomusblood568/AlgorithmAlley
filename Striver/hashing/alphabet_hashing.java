//Code if the string contains only lowercase
import java.util.*;
public class alphabet_hashing {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
    String s;
    s = sc.next();
        System.out.println("enter the chacter you want to check");


        //precompute
        int[] hash = new int[26];//we are taking only 26 cause we are only considering lower case
        for (int i = 0; i<s.length(); i++){
            hash[s.charAt(i)-'a']++;
        }
        int q;
        q = sc.nextInt();
        while(q--> 0){
            char c;
            c = sc.next().charAt(0);
            //fetch
            System.out.println(hash[c-'a']);
        }
    }

}
