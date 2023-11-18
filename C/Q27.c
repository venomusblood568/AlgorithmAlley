//write a program in c to find the maxium number between two number using a pointer.

#include <stdio.h>

int findmax(int *ptr1, int *ptr2){
    if(*ptr1 > *ptr2){
        return *ptr1;
    }
    else{
        return *ptr2;
    }
}

int main(){
    int num1,num2;

    //input two number
    printf("enter the first number: ");
    scanf("%d",&num1);

    printf("enter the second number: ");
    scanf("%d",&num2);

    int *ptr1 = &num1;
    int *ptr2 = &num2;

    printf("maximum number: %d\n",findmax(ptr1,ptr2));
}