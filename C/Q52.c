//check if the given character is present in a string or not 

#include<stdio.h>
#include<string.h>

int isCharPresent(const char* str, char ch){
    return strchr(str,ch) != NULL;
}

int main(){
    const char* testString = "Hello, World";

    char charTOCheck = 'o';

    if(isCharPresent(testString,charTOCheck)){
        printf("The charcter '%c' is present in the string. \n",charTOCheck);
    }
    else{
        printf("the character '%c' is not present in the string. \n",charTOCheck);
    }

    return 0;
}