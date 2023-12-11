//make a program that takes user's name and return its length

#include<stdio.h>
#include<string.h>

int main(){
    char name[100];

    printf("enter your name: ");

    scanf("%99[^\n]",name);

    printf("Length of each word: \n");

    int length = 0;
    for(int i = 0; i <= strlen(name); i++){
        if(name[i] == ' ' || name[i] == '\0'){
            if(length > 0){
                printf("%d ",length);
                length = 0;
            }
        }
        else{
            length++;
        }
    }
    printf("\n");
    return 0;
}