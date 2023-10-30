import  java.util.*;
public class majority_element_better {
    public static int majority_element(int []v){
        int n = v.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i <n; i++){
            int value = mpp.getOrDefault(v[i],0);
            mpp.put(v[i],value+1);
        }
        for(Map.Entry<Integer,Integer> it : mpp.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getValue();
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int[] arr = {2,2,1,1,1,2,2};
        int ans = majority_element(arr);
        System.out.println("The majority element is: "+ ans);
    }
}
