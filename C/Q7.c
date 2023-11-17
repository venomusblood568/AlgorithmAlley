//write a program to check if a given number is Armstrong number or not

#include<stdio.h>
#include<math.h>

int isArmstrong(int number){
    int originalNumber = number;
    int n = (int)log10(number) + 1;

    int result = 0;
    while(originalNumber != 0){
        int digit = originalNumber % 10;
        result += pow(digit,n);
        originalNumber /= 10;
    }
    return (result == number);
}

int main(){
    int number;

    printf("enter an integer: ");
    scanf("%d", &number);

    if(isArmstrong(number)){
        printf("%d is an armstrong number. \n",number);
    }
    else{
        printf("%d is not an armstrong number. \n",number);
    }

    return 0;
}