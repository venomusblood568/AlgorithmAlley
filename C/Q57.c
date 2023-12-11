//create a structure to store vector then make afunction to return sum of 2 vectors.

#include<stdio.h>

struct Vector
{
    float x;
    float y; 
    float z;
};

struct Vector addVectors(struct  Vector v1, struct  Vector v2)
{
    struct Vector sum;
    sum.x = v1.x + v2.x;
    sum.y = v1.y + v2.y;
    sum.z = v1.z + v2.z;
    return sum;
};

int main(){
    struct Vector vector1 = {1.0, 2.0, 3.0};
    struct Vector vector2 = {4.0, 5.0, 6.0};

    struct Vector result = addVectors(vector1, vector2);

    // Display the original vectors and the sum
    printf("Vector 1: <%f, %f, %f>\n", vector1.x, vector1.y, vector1.z);
    printf("Vector 2: <%f, %f, %f>\n", vector2.x, vector2.y, vector2.z);
    printf("Sum of Vectors: <%f, %f, %f>\n", result.x, result.y, result.z);

    return 0;
}

