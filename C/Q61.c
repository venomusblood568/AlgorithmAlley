//Make a program to input student information from a user & enter it to a file.

#include <stdio.h>

struct Student {
    char name[50];
    int rollNumber;
    float marks;
};

int main() {
    FILE *file;
    char filename[] = "student_info.txt"; // Replace with your file name

    // Open the file for writing
    file = fopen(filename, "w");

    if (file == NULL) {
        fprintf(stderr, "Error opening file '%s' for writing\n", filename);
        return 1;
    }

    struct Student student;

    // Input student information from the user
    printf("Enter student information:\n");
    printf("Name: ");
    scanf("%s", student.name);
    printf("Roll Number: ");
    scanf("%d", &student.rollNumber);
    printf("Marks: ");
    scanf("%f", &student.marks);

    // Write student information to the file
    fprintf(file, "Name: %s\n", student.name);
    fprintf(file, "Roll Number: %d\n", student.rollNumber);
    fprintf(file, "Marks: %.2f\n", student.marks);

    // Close the file
    fclose(file);

    printf("Student information has been written to the file '%s'\n", filename);

    return 0;
}
