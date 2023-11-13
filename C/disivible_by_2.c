#include <stdio.h>
#include <math.h>

int main() {
    int number;
    printf("Enter the number you want to check for divisibility by 2: ");
    scanf("%d", &number);
    printf("%d\n", number % 2 == 0);
    return 0;
}
