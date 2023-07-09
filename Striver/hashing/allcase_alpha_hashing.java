//Code if the string contains both uppercase and lowercase:
import java.util.*;
public class allcase_alpha_hashing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string [upper case and lower case both are accpeted] : ");
        String s;
        s = sc.next();
        System.out.println("enter the number you want to check : ");

        //precompute
        int[] hash = new int[256];
        for(int i = 0; i<s.length();i++){
            hash[s.charAt(i)]++;
        }
        int q;
        q = sc.nextInt();
        while(q--> 0){
            char c;
            c = sc.next().charAt(0);
            //fetch:
            System.out.println(hash[c]);
        }
    }
}
