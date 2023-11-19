// write a function to find square root of a number

#include<stdio.h>
#include<math.h>

double find_square_root(double number);

int main(){
    double num;

    //input a number from the user
    printf("enter a number: ");
    scanf("%lf",&num);

    //call the function to find the square root
    double result = find_square_root(num);

    //display the result 
    printf("square root: %lf\n",result);

    return 0;

}

double find_square_root(double number){
    return sqrt(number);
}