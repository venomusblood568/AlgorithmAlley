//swap 2 number a and b 

#include<stdio.h>

void swap(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main(){
    int a,b;
    //input of a
    printf("enter the value of A: ");
    scanf("%d",&a);

    //input of b
    printf("enter the value of B: ");
    scanf("%d",&b);

    //print the original values
    printf("before swapping: a = %d , b = %d \n",a,b);

    swap(&a,&b);

    //print the swap function
    printf("after swapping: a= %d, b = %d \n",a,b);


    return 0;
}