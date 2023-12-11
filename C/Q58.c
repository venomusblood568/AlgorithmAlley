//make a structure to store bank account information of a customer of ABC bank.also, make an alias for it
#include <stdio.h>

struct  BankAccount
{
    char accountHolderName[50];
    long long accountNumber;
    double accountBalance;
};

typedef struct BankAccount BankAccountInfo;

int main(){
    BankAccountInfo customer1 = {"John Doe",123456789012, 5000.00};
    BankAccountInfo customer2 = {"gourav anand",12345678900987,6000.0};

    // Display Bank Account Information
    printf("Account Holder Name: %s\n", customer1.accountHolderName);
    printf("Account Number: %lld\n", customer1.accountNumber);
    printf("Account Balance: %.2f\n", customer1.accountBalance);

    // Display Bank Account Information
    printf("Account Holder Name: %s\n", customer2.accountHolderName);
    printf("Account Number: %lld\n", customer2.accountNumber);
    printf("Account Balance: %.2f\n", customer2.accountBalance);
    return 0;

}
