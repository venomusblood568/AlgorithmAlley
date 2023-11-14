#include<stdio.h>

//increment operator
// i-- = pre decrement 
// --i = post decrement


int main(){
    int i = 1;
    printf("%d \n", i--); //use, the decrement
    printf("%d \n", i); 

    printf("%d \n", --i); //decrement then use
    printf("%d \n", i); 
    return 0;

}