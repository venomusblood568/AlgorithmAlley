//print the sum of first N natural number 
//also, print them in reverse

#include<stdio.h>

int main(){
    int n, sum = 0;

    printf("enter the value of n: ");
    scanf("%d",&n);

    //calculate the sum of first n natural numbers
    for(int i = 1; i <=n; ++i){
        sum += i;
    }

    //print the sum
    printf("sum of first %d natural number: %d \n",n,sum);

    //print the number in reverse 
    printf("Number in reverse: \n");
    for(int i = n; i >= 1; --i){
        printf("%d\n",i);
    }
    return 0;
}