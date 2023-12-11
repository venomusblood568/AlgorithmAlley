//write a function to count the occurence of vowel in a string 
#include<stdio.h>
#include<ctype.h>
#include<string.h>

int countVowels(const char* str){
    int count = 0;

    const char* vowels = "aeiouAEIOU";

    for(int i = 0; str[i] != '\0'; i++){
        if (strchr(vowels,str[i]) != NULL){
            count++;
        }
    }
    return count;
}

int main(){
    const char* testString = "hello world";
    int vowelCount = countVowels(testString);
    printf("number of vowels: %d\n",vowelCount);
    return 0;
}
