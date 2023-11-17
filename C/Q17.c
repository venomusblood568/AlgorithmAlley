//Write a function that prints Namaste if user is Indian & Bonjour if the user is French.

#include<stdio.h>
#include<string.h>

void greetUser(char nationality[]){
    if(strcmp(nationality,"Indian")==0){
        printf("Namaste! \n");
    }
    else if (strcmp(nationality,"French")==0){
        printf("Bonjour! \n");
    }
    else{
        printf("Hello! \n");
    }
}

int main(){
    char nationality[50];

    printf("enter your nationality: ");
    scanf("%s",nationality);

    greetUser(nationality);
    
    return 0;
}