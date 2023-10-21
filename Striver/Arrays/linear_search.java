public class linear_search {
    public static int linearserch(int[] arr, int target){
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return  -1;
    }
    public  static  void main(String[] args){
        int[] arr = {4, 2, 7, 1, 9, 5, 6};
        int target = 7;

        int result = linearserch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

    }

}
