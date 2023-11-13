#include<stdio.h>

int main(){
    // 1 = mon , 2 = tuesday and so foruth for week
    int day; 
    printf("enter the number for week [1-7]: ");
    scanf("%d",&day);
    switch (day)
    {
    case 1:
        printf(" hey human its a monday");
        break;
    case 2:
        printf(" hey human its a tuesday");
        break;
    case 3:
        printf(" hey human its a wednesday");
        break;
    case 4:
        printf(" hey human its a thursday");
        break;
    case 5:
        printf(" hey human its a friday");
        break;
    case 6:
        printf(" hey human its a saturday");
        break;
    case 7:
        printf(" hey human its a sunday");
        break;
    default:
        printf("human are you dumb dont you know how many days are in a week uh!!!!!");
        break;
    }
}