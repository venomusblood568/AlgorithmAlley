#include<stdio.h>

void PrintTable(int n);

int main(){
    int n;
    printf("human enter a number : ");
    scanf("%d",&n);
    
    //argument/ actual parameter
    PrintTable(n);
    return 0;
}

void PrintTable(int n){ 
    // parameter / formal parameter
    for(int i = 1; i <= 10; i++){
        printf("%d \n",i*n);
    }
}