//write a function to print "HOT" or "COLD" depends on the temp user enter

#include<stdio.h>

void checkTemp(int temperature);

int main(){
    int temp;

    //input the temperature from the user
    printf("enter the temperature: ");
    scanf("%d",&temp);

    //call the function to check temperature and print result
    checkTemp(temp);

    return 0;

}

void checkTemp(int temperature){
    if(temperature >= 30){
        printf("ITS HOT OUT YOU LITTLE BITCH!!!!");
    }
    else{
        printf("ITS COLD OUTSIDE LITTLE PUSSY!!!!!!");
    }
}