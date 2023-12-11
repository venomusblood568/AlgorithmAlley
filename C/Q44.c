// In a array of number, find how many times does a number "X" occurs
#include <stdio.h>

int main(){
    int number[] = {2,4,6,8,2,5,2,7,2,9};
    int size = sizeof(number)/sizeof(number[0]);

    int x = 2;

    int count = 0;
    for(int i = 0; i < size; i++){
        if(number[i] == x){
            count++;
        }
    }

    printf("the number %d occurs %d times in the array. \n", x, count);

    return 0;
}