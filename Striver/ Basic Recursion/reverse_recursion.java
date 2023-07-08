public class reverse_recursion {
    public static void main(String args[]){
        int n = 5;
        int arr[] = {1,2,4,56,74};
        reversearray(arr,0,n-1);
        printarr(arr,n);
    }
    // function of print array
    public static void printarr(int arr[],int n){
        System.out.print("reversed array is: ");
       for(int i = 0; i < n;i++){
           System.out.print(arr[i] + " ");
       }
    }
    //function to reverse array using recursion
    public static void reversearray(int arr[],int start,int end){
        if (start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reversearray(arr,start+1,end-1);
        }
    }
}
