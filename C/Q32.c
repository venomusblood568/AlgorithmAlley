//factorial of n 

#include<stdio.h>

int factorial(int n);

int main(){
    int n;

    //input a number from the user 
    printf("enter a number: ");
    scanf("%d",&n);

    //calculate and print the factorial 
    printf("factorial of %d is: %d\n", n ,factorial(n));

    return 0;
}

//function to calculate factorial using recusion 
int factorial(int n){
    if( n == 0 || n == 1){
        return 1;
    }
    else{
        return n * factorial(n-1);
    }
}