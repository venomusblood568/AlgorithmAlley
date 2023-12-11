//Find the salted form of a password entered by user if the salt is "123" & added at the end.

#include<stdio.h>
#include<string.h>

int main(){
    char password[100];
    char salt[] = "123";
    char saltedpassword[100];

    printf("enter your password: ");

    scanf("%99s",password);

    // Copy the entered password to the saltedPassword
    strcpy(saltedpassword,password);

    // Concatenate the salt to the saltedPassword
    strcat(saltedpassword,salt);

    printf("Salted password : %s\n", saltedpassword);

    return 0;
}