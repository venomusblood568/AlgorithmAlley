# include<stdio.h>

int main(){
    //variable types
    int number = 25;
    char star = '*';
    int age = 22;
    float pi = 3.14;
    
    // for printing the integer
    printf("age is %d \n",age);

    // for printing the real number
    printf("value of pi is %f \n",pi);

    // for printing the character 
    printf("star looking like this %c \n",star);
    
    // for taking the input from the user
    int student_age;
    printf("enter the student age : ");
    scanf("%d", &student_age);
    printf("age is:  %d",student_age);
    
    return 0;

}