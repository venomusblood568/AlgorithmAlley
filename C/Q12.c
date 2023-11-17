//print all the factorial of a number !!

#include<stdio.h>

int main(){
    int n;
    unsigned long long factorial = 1;

    //input a number
    printf("Enter a non-negative integer: ");
    scanf("%d",&n);

    if(n<0){
        printf("factorial is not defined for negative numbers: \n");
    }
    else{
        //calculate factorial 
        for(int i = 1; i <= n; ++i){
            factorial *= i;
        }
        //print the result 
        printf("factorial of %d is %llu\n",n,factorial);
    
    }
    return 0;
    
}