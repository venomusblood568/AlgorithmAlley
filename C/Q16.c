//write a prime number in a range 

#include<stdio.h>

int isPrime(int number){
    if(number <= 1){
        return 0;
    }

    for(int i = 2; i * i <= number ; i++){
        if (number % i == 0){
            return 0;
        }
    }
    return 1;
}

int main(){
    int start,end;

    //input 
    printf("enter the start of the range: ");
    scanf("%d",&start);

    printf("enter the start of the range: ");
    scanf("%d",&end);

    printf("prime number in the range %d to %d are: \n",start,end);
    for(int i = start; i <= end; ++i){
        if(isPrime(i)){
            printf("%d\n",i);
        }
    }
    return 0;
}