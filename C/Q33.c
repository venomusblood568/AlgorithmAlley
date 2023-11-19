//write a function to convert celsius to fahrenheit

#include<stdio.h>

// Function prototype
float convertToCelsius(float fahrenheit);

int main() {
    float fahrenheit, celsius;

    // Input temperature in Fahrenheit from the user
    printf("Enter temperature in Fahrenheit: ");
    scanf("%f", &fahrenheit);

    // Call the function to convert Fahrenheit to Celsius
    celsius = convertToCelsius(fahrenheit);

    // Display the result
    printf("%.2f Fahrenheit is equal to %.2f Celsius\n", fahrenheit, celsius);

    return 0;
}

// Function definition to convert Fahrenheit to Celsius
float convertToCelsius(float fahrenheit) {
    return (5.0 / 9.0) * (fahrenheit - 32.0);
}

