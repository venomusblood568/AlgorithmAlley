#include<stdio.h>

int main(){
    int age;
    printf("enter the age: ");
    scanf("%d",&age);

    if(age >= 18){
        printf("this human is adult \n");
    }
    else if(age >= 13 && age < 18){
        printf("this human is teenage \n");
    }
    else{
        printf("thi human is child");
    }
    return 0;
}