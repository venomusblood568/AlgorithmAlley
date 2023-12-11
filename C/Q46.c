// program that inserts an element at the end of an array

#include<stdio.h>

int main(){
    int number[100] = {1,2,4,5,6};
    int size = 5;

    int insert_element = 10;

    if(size < 100){
        number[size] = insert_element;
        size++;

        printf("Array after inserting %d at the end: \n", insert_element);
        for(int i = 0; i < size; i++){
            printf("%d",number[i]);
        }
        printf("\n");
    }
    else{
        printf("Array is full. cannot insert more elements. \n");
    }
    return 0;
    
}