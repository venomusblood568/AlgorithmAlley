//print all the number from 0 to n
#include<stdio.h>

int main(){
    int n;
    printf("enter the number n: ");
    scanf("%d",&n);

    for(int i = 0; i <= n; ++i){
        printf("%d\n",i);
    }
    return 0;
    
}