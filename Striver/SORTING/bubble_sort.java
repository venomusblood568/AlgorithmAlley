public class bubble_sort {
    static void  algo_part(int[] arr, int n ){
        for(int i = n-1; i>= 0; i--){
            for (int j = 0 ; j <= i-1; j++){
                if(arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("after bubble sort: ");
        for(int i= 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("bubble using bubble sort: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        algo_part(arr,n);
    }
}
