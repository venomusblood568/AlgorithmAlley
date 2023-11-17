//print reverse of the table for a number n!!!

#include<stdio.h>

int main(){
    int n;
    //input a number 
    printf("enter the number  human: ");
    scanf("%d",&n);


    //print the reverse multiplcation table
    printf("reverse multiplication table for %d: \n",n);
    for (int i = 10; i >= 1; --i){
        printf("%d X %d = %d\n",n,i,n*i);
    }
    return 0;
}