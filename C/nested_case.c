#include<stdio.h>

int main(){
    int number;
    printf("enter number: ");
    scanf("%d",&number);

    if(number > 0){
        printf("human the number you entered is positive \n");
        if(number % 2 == 0){
            printf("and the number you enteres is even as well \n");
        }
        else {
            printf("and you dumb dumb the number is odd!!! \n");
        }
    }
    else{
        printf("human the number you entered is negative \n");
    }
    return 0;
}