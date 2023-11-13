#include<stdio.h>

int main(){
    int age;
    printf("enter the age: ");
    scanf("%d", &age);

    if(age >= 18){
        printf("adult \n");
        printf("the can vote \n");
        printf("they can drive \n");
    }
    else{
        printf("not an adult \n");
    }
    printf("Thank you!!!🥹");

    return 0;
}