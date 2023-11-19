//write a function to find sum of digits of a number 
#include<stdio.h>

// Function prototype
int sumOfDigits(int number);

int main() {
    int num;

    // Input a number from the user
    printf("Enter a number: ");
    scanf("%d", &num);

    // Call the function to find the sum of digits
    int result = sumOfDigits(num);

    // Display the result
    printf("Sum of digits: %d\n", result);

    return 0;
}

// Function definition to find the sum of digits
int sumOfDigits(int number) {
    int sum = 0;

    // Iterate through each digit of the number
    while (number != 0) {
        sum += number % 10;  // Add the last digit to the sum
        number /= 10;        // Remove the last digit from the number
    }

    return sum;
}
