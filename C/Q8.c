//write a program to check if a number is natural number or not !!!!
#include<stdio.h>

int isPrime(int number){
    if (number <= 1){
        return 0; //Not a prime number
    }

    for(int i = 2; i * i <= number; i++){
        if(number % i == 0){
            return 0;  //Not a prime number
        }
    }

    return 1;       //It's prime number
}

int main(){
    int number;

    printf("enter a positive integer: ");
    scanf("%d", &number);

    if(isPrime(number)){
        printf("%d is a prime number. \n",number);
    }
    else{
        printf("%d is not a prime number. \n",number);
    }
    return 0;
}