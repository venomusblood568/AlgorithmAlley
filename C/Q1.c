//write a program to print the average of 3 number.

#include<stdio.h>

int main(){
    int a,b,c;
    printf("enter the value of a:");
    scanf("%d",&a);

    printf("enter the value of b: ");
    scanf("%d",&b);

    printf("enter the value of c: ");
    scanf("%d",&c);

    int avg = (a + b +c)/3;
    printf("avg: %d \n",avg);

    return 0;
}