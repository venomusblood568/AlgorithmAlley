//write a function to convert all the upper case vowel to uppercase in a string

#include<stdio.h>
#include<ctype.h>
#include<string.h>

void convertToLowercase(char* str) {
    for(int i = 0; str[i] != '\0'; i++){
        str[i] = toupper(str[i]);
    }
}

int main(){
    char teststring[] = "Hello World";

    convertToLowercase(teststring);

    printf("Uppercase string: %s\n",teststring);

}