//Create a String firstName & lastName to store details of user & print all the characters using a loop.
#include<stdio.h>

int main(){
    char firstName[] = "GOURAV";
    char lastName[] ="ANAND";

    printf("first name: ");
    for(int i = 0; firstName[i] != '\0'; i++){
        printf("%c ",firstName[i]);
    }
    printf("\n");

    printf("last name: ");
    for(int i = 0; lastName[i] != '\0'; i++){
        printf("%c ",lastName[i]);
    }
    printf("\n");
    return 0;
}