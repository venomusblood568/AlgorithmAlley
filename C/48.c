//ask user for input then return the input
#include<stdio.h>

int main(){
    char UserInput[100];

    printf("Enter something: ");

    scanf("%99[^\n]",UserInput);

    printf("you entered: %s\n",UserInput);

    return 0;
}