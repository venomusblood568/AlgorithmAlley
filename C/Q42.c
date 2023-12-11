//Write a program to store the first n fibonacci number in an array
#include<stdio.h>

void generate_fibonacci(int fibarray[],int n){
    fibarray[0] = 0;
    fibarray[1] = 1;

    for(int i = 2; i < n; i++){
        fibarray[i] = fibarray[i - 1] + fibarray[i - 2];
    }
}

int main(){
    int n;
    printf("Enter the value of n: ");
    scanf("%d",&n);

    int fibonacciARRAY[n];

    generate_fibonacci(fibonacciARRAY,n);

    //print the Fibonacci numbers
    printf("First %d Fibonacci numbers: ",n);
    for(int i = 0; i < n; i++){
        printf("%d",fibonacciARRAY[i]);
    }
    
    return 0;
}