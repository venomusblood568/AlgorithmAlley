public class remove_duplicate_optimal {
    public static void main(String[] args){
        int arr[] = {1,1,2,2,2,3,3};
        int k = remove_duplicate(arr);
        System.out.println("the array after removing duplicate: ");
        for(int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int remove_duplicate(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
