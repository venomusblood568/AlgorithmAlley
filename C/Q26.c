//write a function to calculate the sum, product and average of 2 number. print the avergae in the main function

#include<stdio.h>

void sum(int a,int b);
void product(int a, int b);
void avg(int a,int b);


int main(){
    int x,y;

    printf("enter the value of x: ");
    scanf("%d",&x);

    printf("enter the value of y: ");
    scanf("%d",&y);

    sum(x,y);
    product(x,y);
    avg(x,y);
}

void sum(int a, int b){
    int sum_a_b = a + b;
    printf("SUM: %d\n",sum_a_b);
}

void product(int a, int b){
    int pro_a_b = a * b;
    printf("PRODUCT: %d\n",pro_a_b);
}

void avg(int a, int b){
    int avg_a_b = (a + b)/2;
    printf("AVERAGE: %d\n",avg_a_b);
}