//write a program to check if given character is digit or not.

#include<stdio.h>
#include<ctype.h>


//method two
int main(){
    char ch;
    printf("enter the character: ");
    scanf(" %c",&ch);

    if(isdigit(ch)){
        printf("human the chracter you entered is digit!!! %c",ch);
    }
    else{
        printf("the character you entered is not a digit!!! %c",ch);
    }

    return 0;
}


//way one
/*
int main(){
    char ch;
    printf("enter a ch or digit: ");
    scanf("%c",&ch);

    if(ch == '0' || ch == '1'||ch == '2'||ch == '3'||ch == '4'||ch == '5'||ch == '6'||ch == '7'||ch == '8'||ch == '9'){
        printf("ch is a digit.",ch);
        
    }
    else{
        printf("not a digit!!",ch);
    }

    return 0;
}
*/