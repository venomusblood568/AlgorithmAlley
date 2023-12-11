//write a function to count the number of odd number in an array
#include<stdio.h>

int countOddNumber(const int arr[],int size){
    int oddCount = 0;

    for(int i = 0; i < size ; i++){
        if(arr[i] % 2 != 0){
            oddCount++;
        }
    }
    return oddCount;
}

int main(){
    int number[] = {1,2,3,4,5,6,7,8,9,10};
    int size = sizeof(number) / sizeof(number[0]);

    int oddcount = countOddNumber(number,size);

    printf("Number of odd number: %d\n",oddcount);

    return 0;

}