public class Longest_Consecutive_Sequence_in_Array_brute {
    public static boolean linearsearch(int[] a, int num){
        int n = a.length;
        for(int i = 0; i < n; i++){
            if(a[i] == num)
                return true;
        }
        return false;
    }
    public static int longest_successive_element(int[]a){
        int n = a.length;
        int longest = 1;
        for(int i = 0; i <n; i++){
            int x = a[i];
            int cnt = 1;
            while(linearsearch(a,x+1) == true ){
                x += 1;
                cnt += 1;
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }
    public static void main(String[] args){
        int[] a = {100,200,1,2,3,5};
        int ans = longest_successive_element(a);
        System.out.println("the logest consecutive sequence is : "+ans);
    }
}
