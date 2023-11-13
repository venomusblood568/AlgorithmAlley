#include<stdio.h>

int main(){
    int age;
    printf("enter the age: ");
    scanf("%d", &age);

    //condition ? doSomething if True : doSomething if False;
    age >= 18 ? printf("this human is adult \n") : printf("this human is not adult \n");

    return 0;
}
