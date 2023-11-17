//write a program to print the smallest number

#include<stdio.h>

int main(){
    int num1,num2,num3;

    printf("Enter the first number: ");
    scanf("%d",&num1);

    printf("Enter the second number: ");
    scanf("%d",&num2);

    printf("Enter the third number: ");
    scanf("%d",&num3);

    //for finding the smallest number
    int smallest = num1;

    if(num2 < smallest){
        smallest = num2;
    }
    if(num3<smallest){
        smallest = num3;
    }

    //for printing the smallest number
    printf("the smallest number is: %d \n",smallest);
    return 0;

}