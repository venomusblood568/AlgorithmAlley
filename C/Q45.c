//write a program to print the largest number in an array
#include<stdio.h>

int main(){
    int numbers[] = {12,5,23,45,8,17,9,34};

    int size = sizeof(numbers) / sizeof(numbers[0]);

    int largest = numbers[0];

    for (int i = 1; i < size; i++){
        if(numbers[i] > largest){
            largest = numbers[i];
        }
    }

    printf("the largest number in the array is %d\n", largest);

    return 0;
}