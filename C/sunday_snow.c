#include<stdio.h>
// output 1 is true and output 0 is false 
// c language don't have true false thing instead of that it have 1 and 0.
int main(){
    int Issunday = 1;
    int snowing = 1;
    printf("if it's sunday & it's snowing : %d \n",Issunday && snowing);

    int monday = 1;
    int raining = 1;
    printf("if it's monday and its raining: %d \n", monday || raining);

    int number = 12;
    printf("if a number is greater than 9 & less than 100: %d \n",(number > 9) && (number < 100 ));
    return 0;
}