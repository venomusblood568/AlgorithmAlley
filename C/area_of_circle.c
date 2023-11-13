# include <stdio.h>

int main(){
    float radius;
    printf("ente the radius in m: ");
    scanf("%f",&radius);

    int area = 3.14 * radius * radius;
    printf("area of the circle: %d \n",area);
    return 0;
    

}