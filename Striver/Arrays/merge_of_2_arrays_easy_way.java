import java.util.*;
public class merge_of_2_arrays_easy_way {
    public static List<Integer> sortedarray(int[] a, int[] b){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num:a){
            arr.add(num);
        }
        for(int num:b){
            arr.add(num);
        }
        Collections.sort(arr);
        for (int i = 1; i < arr.size(); i++){
            if(arr.get(i-1) >= arr.get(i)){
                arr.remove(arr.get(i-1));
                i--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr1 = {2,3,7,9};
        int[] arr2 = {5,1,9,2};

        List<Integer> result = sortedarray(arr1,arr2);
        System.out.println("merged,sorted,and duplicate-free array: "+ result);
    }


}
