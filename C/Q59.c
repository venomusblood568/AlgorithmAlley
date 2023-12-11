//make a program to read 5 integer from a file 

#include <stdio.h>

int main(){
    FILE *file;
    char filename[] = "number.txt";

    file = fopen(filename,"r");

    if(file == NULL){
        fprintf(stderr,"Error opening file '%s' \n",filename);
        return 1;
    }
    int numbers[5];

    //read 5 integers from the file
    for(int i = 0; i < 5; i++){
        if(fscanf(file,"%d",&numbers[i]) != 1){
            fprintf(stderr,"Error reading integer from file \n");
            fclose(file);
            return 1;
        }
    }
    fclose(file);

    printf("read integers from file: \n");
    for(int i = 0; i < 5; i++){
        printf("%d\n",numbers[i]);
    }
    return 0;
}