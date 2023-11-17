//write a program to find if a character entered by user is upper case or not!!!

#include<stdio.h>
#include<ctype.h>

int main(){
    char character;
    printf("enter a character: ");
    scanf(" %c",&character);

    if(isupper(character)){
        printf("human the character you enter is '%c' and its a upper case ",character);
    }
    else{
        printf("human the character you enter is '%c' and its not a upper case",character);
    }
    return 0;
}