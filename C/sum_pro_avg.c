#include<stdio.h>

void dowork(int a, int b, int *sum, int *product, int *avg);

int main(){
    int a = 3, b = 5;
    int sum , product, avg;
    dowork(a,b,&sum,&product,&avg);
    printf("sum = %d, product = %d, average = %d \n",sum,product,avg);
    return 0;   
}

void dowork(int a, int b, int *sum, int *product, int *avg){
    *sum = a + b;
    *product = a*b;
    *avg = (a+b)/2;
}