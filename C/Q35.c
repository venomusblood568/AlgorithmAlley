//write a function to print n terms of the fibonacci sequence

#include<stdio.h>

//function 
void print_fibonacci(int n);

int main(){
    int terms;

    //input the number of terms from the user
    printf("enter the number of terms in the fibonacci sequence: ");
    scanf("%d",&terms);

    //call the function to print fibonacci sequence 
    print_fibonacci(terms);

    return 0;
}

//function definition to print n terms of the fibonacci sequence 
void print_fibonacci(int n){
    int first_term = 0;
    int sec_term = 1;
    int next_term;

    printf("Fibonacci sequence for %d terms: ",n);

    for(int i = 1; i <= n; ++i){
        printf("%d ",first_term);
        next_term = first_term  + sec_term;
        first_term = sec_term;
        sec_term = next_term;
    }
    printf("\n");
}