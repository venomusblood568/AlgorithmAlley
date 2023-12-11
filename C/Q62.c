//write a program to write all the odd number from 1 to n in a file.

#include<stdio.h>

int main(){
    FILE *file;
    char filename[] = "odd_number.txt";
    int n;

    file = fopen(filename,"w");

    if(file == NULL){
        fprintf(stderr,"Error opening file '%s' for writing \n",filename);
        return 1;
    }

    printf("Enter the value of n: ");
    scanf("%d",&n);

    for(int i = 1; i <= n; i += 2){
        fprintf(file, "%d\n",i);
    }

    fclose(file);

    printf("Odd number from 1 to '%d' have been written to the file '%s' \n",n,filename);

    return 0;
}
