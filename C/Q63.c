//WAP to allocate memory of size n, where n is entered by the user.

#include<stdio.h>
#include<stdlib.h>

int main(){
    int n;
    int *dynamicArray;

    //Input the value of n from the user
    printf("Enter the size of the dynamic array(n): ");
    scanf("%d",&n);

    dynamicArray = (int*)malloc(n * sizeof(int));

    if(dynamicArray == NULL){
        fprintf(stderr,"Memory allocation failed \n");
        return 1;
    }

    printf("Enter %d integer values: \n",n);
    for(int i = 0; i < n; i++){
        printf("Element %d", i+1);
        scanf("%d",&dynamicArray);
    }

    printf("\nValues in the dynamics array: \n");
    for(int i = 0; i < n; i++){
        printf("Element %d: %d\n", i + 1,dynamicArray[i] );

    }

    free(dynamicArray);
    
    return 0;
    
}