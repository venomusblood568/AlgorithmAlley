//Write a function to calculate Percentage of a student from Marks in Science, Math & Sanskrit.

#include<stdio.h>

float calculate_percentage(float science, float math, float sanskrit);

int main(){
    float sci_marks , math_marks, san_marks, percentage;

    printf("enter marks in science: ");
    scanf("%f",&sci_marks);

    printf("enter marks in math: ");
    scanf("%f",&math_marks);

    printf("enter marks in sanskrit: ");
    scanf("%f",&san_marks);

    percentage = calculate_percentage(sci_marks,math_marks,san_marks);

    printf("percentage: %.2f%%\n",percentage);

    return 0;
}

float calculate_percentage(float science, float math, float sanskrit){
    float totalmarks = science + math + sanskrit;
    float percentage = (totalmarks / 300.0) * 100.0;
    return percentage;
}