public class largest_number_optimal {
    public static void main(String[] args) {
        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("largest element in the array is: " + largest_number_algo(arr1));
    }
    // this is way better brute force which is at 97.79% performance...
    static int largest_number_algo(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return  max;
    }
}