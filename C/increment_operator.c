#include<stdio.h>

//increment operator
// i++ = pre increment 
// ++i = post increment


int main(){
    int i = 1;
    printf("%d \n", i++); //use, the increment
    printf("%d \n", i); 

    printf("%d \n", ++i); //increment then use
    printf("%d \n", i); 
    return 0;

}