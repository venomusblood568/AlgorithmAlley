//write a program to check if a number is prime or not
#include<stdio.h>

int isPrime(int number){
    if(number <= 1){
        return 0; //not a prime number 
    }

    for(int i = 2; i*i <= number; ++i){
        if(number % i == 0){
            return 0; //not a prime number
        }
    }

    return 1;
}
int main(){
    int number;

    printf("enter a positive integer: ");
    scanf("%d",&number);

    if(isPrime(number)){
        printf("%d is a prime number.\n",number);
    }
    else{
        printf("not a prime number !!!!!!!!");
    }
    return 0;
}
