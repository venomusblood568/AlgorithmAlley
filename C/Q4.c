//write a program to check if a student passed or failed
#include<stdio.h>

int main(){
    int marks;
    printf("enter the marks: ");
    scanf("%d",&marks);
    //condition can be written in other way like 
    //marks <= 30 ? printf("FAIL \n"):printf("PASS \n");
    if(marks >= 30){
        printf("PASSED %d \n",marks);
        
    }
    else{
        printf("FAIL %d \n",marks);
    }
    return 0;
}