// keep puting the input until the user input any odd number

#include<stdio.h>

int main(){
    int num;

    while(1){
        printf("enter a number: ");
        scanf("%d",&num);

        if(num % 2 !=0){
            printf("you have entered an odd number!\n");
            break;
        }
    }
    return 0;
}