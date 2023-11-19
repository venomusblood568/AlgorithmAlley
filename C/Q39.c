// make your own pow function

#include<stdio.h>

double customPow(double base, int exponent);

int main(){
    double base;
    int exponent;

    //input the base and exponent from the user
    printf("enter the base: ");
    scanf("%lf",&base);

    printf("enter the exponents: ");
    scanf("%d",&exponent);

    //call the custom power function and display the result
    double result = customPow(base,exponent);
    printf("Result: %.21f\n",result);
}

double customPow(double base, int exponent){
    double result = 1.0;

    //handle positive exponent
    for(int i = 0; i < exponent ; ++i){
        result *= base;
    }

    //handle negative exponent 
    for(int i = 0; i > exponent; --i){
        result /= base;
    }

    return result;
}