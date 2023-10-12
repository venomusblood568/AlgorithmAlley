public class bubble_sort_optimised {
    public  static  void algo_part(int[] arr, int n){
        for (int i = n-1 ; i >= 0 ; i--){
            // for checking if sawp it taking place
            int DIDSWAP = 0;
            for (int j = 0; j <= i-1; j++){
                if (arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    DIDSWAP = 1;
                }
            }
            if (DIDSWAP == 0){
                break;
            }
        }
        System.out.println("after the bubble sort: ");
        for (int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println("Before using bubble sort:  ");
        for(int i = 0 ; i <n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        algo_part(arr,n);
    }
}
