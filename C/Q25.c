// will the address output be same?

#include<stdio.h>

void printAddress(int n);

int main(){
    int n = 4;

    // Print the address of n in the main function
    printf("%p \n",&n);
    
    // Call the printAddress function and pass the value of n
    printAddress(n);

    return 0;
}

void printAddress(int n){
    // Print the address of the local variable n in the printAddress function
    printf("%p \n",&n);
}