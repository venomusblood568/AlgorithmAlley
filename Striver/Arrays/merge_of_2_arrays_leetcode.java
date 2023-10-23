import java.util.*;
public class merge_of_2_arrays_leetcode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //input for arr1
        System.out.print("enter the size of the first array1: ");
        int sizeA = sc.nextInt();
        int [] a = new int[sizeA];
        System.out.print("enter element for the first array: ");
        for(int i = 0; i<sizeA;i++){
            a[i] = sc.nextInt();
        }

        //input for arr2
        System.out.print("enter the size of the second array2: ");
        int sizeB = sc.nextInt();
        int[] b = new int[sizeB];
        System.out.print("enetr the element for the second array2: ");
        for(int i = 0; i<sizeB; i++){
            b[i] = sc.nextInt();
        }

        List<Integer> result = sortedArray(a,b);
        System.out.println("Merged, sorted, and duplicate-free array: " + result);

    }
    public static  List<Integer> sortedArray(int[] a, int[] b){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num: a){
            arr.add(num);
        }
        for (int num: b){
            arr.add(num);
        }
        Collections.sort(arr);
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(arr);
        return new ArrayList<>(uniqueNumbers);
    }
}
