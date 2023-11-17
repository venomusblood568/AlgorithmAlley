//write a program to give grades to a student
//marks < 30 is c
//30 <= marks < 70 is B 
//70 <= marks < 90 is A
//90 <= marks <= 100 is A+

#include<stdio.h>

int main(){
    int marks;
    printf("enter the marks: ");
    scanf("%d",&marks);

    if(90 <= marks && marks <= 100){
        printf("the human is A+ %d with of : ",marks);
    }
    else if(70 <= marks && marks < 90){
        printf("the human is A with of : %d",marks);
    }
    else if(30 <= marks  && marks< 70){
        printf("the human is B  with of : %d",marks);
    }
    else{
        printf("the human is C  with of : %d",marks);
    }
    return 0;

}