//WAP to allocate memory to store 5 prices.

#include<stdio.h>
#include<stdlib.h>

int main(){
    //declare a pointer to store the dynamically allocated memory 
    double *prices;

    prices = (double*)malloc(5* sizeof(double));

    if(prices == NULL){
        fprintf(stderr,"Memory allocation failed \n");
        return 1;
    }

    printf("enter 5 prices: \n");
    for(int i = 0; i <5; i++){
        printf("price %d: ",i+1);
        scanf("%lf",&prices[i]);
    }

    printf("\n Entered prices: \n");
    for(int i = 0; i < 5; i++){
        printf("price %d: %.2f\n", i+1,prices[i]);
    }

    //free the allocated memory 
    free(prices);

    return 0;

}
