//function to convert lowercase to uppercase and vice versa in a string
#include<stdio.h>
#include<ctype.h>
#include<string.h>

void convertCase(char* str){
    for(int i = 0; str[i] != '\0'; i++){
        if(islower(str[i])){
            str[i] = toupper(str[i]);
        }
        else if(isupper(str[i])){
            str[i] = tolower(str[i]);
        }
    }
}

int main(){
    char test_case[] = "Hello World";

    convertCase(test_case);

    printf("Converted string: %s\n",test_case);

    return 0;
}