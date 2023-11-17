#include<stdio.h>

int main(){
    int number;

    while(1){
        printf("enter a number: ");
        scanf("%d",&number);

        if(number % 7 == 0){
            printf("you entered a number that is a multiple of 7. Exiting...\n");
            break;
        }
    }
    return 0;
}