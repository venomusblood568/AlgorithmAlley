//write a program in C to print the element of an array in reverse order

#include<stdio.h>

void printArrayReverse(int arr[], int size){
    printf("Array in reverse order: ");
    for(int i = size -1; i >= 0; --i){
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main(){
    int size;

    printf("enter the size of the array: ");
    scanf("%d",&size);

    int arr[size];

    printf("enter %d elements: \n",size);
    for(int i = 0; i < size; ++i){
        printf("element %d: ",i+1);
        scanf("%d",&arr[i]);
    }

    printArrayReverse(arr,size);

    return 0;
}