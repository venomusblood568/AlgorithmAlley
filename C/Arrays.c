#include<stdio.h>

int main(){
    int marks[3];
    //physics input
    printf("enter physics: ");
    scanf("%d",&marks[0]);

    //chemistry input
    printf("enter chemistry: ");
    scanf("%d",&marks[1]);

    //mathematics input
    printf("enter mathematics: ");
    scanf("%d",&marks[2]);

    printf("phy = %d , che = %d , math = %d",marks[0],marks[1],marks[2]);
}