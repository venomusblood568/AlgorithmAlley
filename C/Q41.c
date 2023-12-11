//write a function to reverse an array
#include <stdio.h>

void reverseArray(int arr[], int size){
    int start = 0;
    int end = size - 1;

    while(start < end){
        
        //swap elements at start and end increase
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    } 
}

int main(){
    int myarray[] = {1,2,3,4,5};
    int size = sizeof(myarray) / sizeof(myarray[0]);

    //print original array
    printf("original array: ");
    for(int i = 0; i < size; i++){
        printf("%d ",myarray[i]);
    }

    //reverse the array
    reverseArray(myarray,size);

    //print reversed array
    printf("\nReversed array: ");
    for(int i = 0 ; i < size; i++){
        printf("%d ",myarray[i]);
    }
    
    return 0;
}