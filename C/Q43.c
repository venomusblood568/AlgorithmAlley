//create a 2D array, storing the table of 2 and 3 
#include<stdio.h>

int main(){
    int rows = 10;
    int col = 2;

    int multiplication_table[10][2];

    for(int i  = 0; i < rows;i++){
        multiplication_table[i][0] = 2 *(i + 1);
        multiplication_table[i][1] = 3 *(i + 1);
    }

    printf("Multiplication table of 2 and 3: \n");
    for(int i = 0; i < rows ; i++){
        printf("%2d * 2 = %2d  %2d * 3 = %2d\n", i + 1,multiplication_table[i][0], i+1,multiplication_table[i][1]);
    }
    return 0;
}