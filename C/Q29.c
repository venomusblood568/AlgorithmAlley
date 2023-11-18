//write a program in c to print all the letter in english alphabet using a pointer 

#include<stdio.h>

int main(){
    char alphabet[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    char *ptr = alphabet;

    printf("letter in english alphabet using a pointer: ");

    while (*ptr != '\0'){
        printf("%c ",*ptr);
        ptr++;
    }
    printf("\n");

    return 0;
}