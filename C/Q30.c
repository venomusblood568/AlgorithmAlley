//use library function to calculate the square of a number given by user.

#include<stdio.h>
#include<math.h>

int main(){
    double num;

    printf("enter a number: ");
    scanf("%lf",&num);

    double sqaure = pow(num,2);

    printf("sqaure of %.21f is: %.21f\n",num,sqaure);

    return 0;
}