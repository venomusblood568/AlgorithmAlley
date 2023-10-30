public class majority_element_optimised {
    public static int majorityelement(int[]v){
        int n = v.length;
        int count = 0;
        int element = 0;

        for (int i = 0; i <n; i++){
            if(count == 0){
                count =1;
                element = v[i];
            }
            else if (element == v[i]) count++;
            else count--;
        }
        int count1 =0;
        for (int i = 0; i<n;i++){
            if(v[i] == element) count1++;
        }
        if(count1 > (n/2) )return element;
        return -1;

    }
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};
        int ans = majorityelement(arr);
        System.out.println("the majority element is: "+  ans);
    }
}
