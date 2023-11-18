//print the value of i from its pointer to pointer 

#include<stdio.h>

int main(){
    int i = 24;
    //pointer to i 
    int *ptr_i = &i;
    //pointer to pointer to i
    int **ptr_ptr_i = &ptr_i;

    printf("value of i from its pointer to pointer: %d\n", **ptr_ptr_i);

    return 0;
}