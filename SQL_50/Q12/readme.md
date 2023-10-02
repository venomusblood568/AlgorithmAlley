# Problem Statement: Students and Examinations

## Table Schema

We have three tables:

### Students

- `student_id` (integer): The unique identifier for each student.
- `student_name` (varchar): The name of the student.

### Subjects

- `subject_name` (varchar): The name of a subject.

### Examinations

- `student_id` (integer): The ID of a student, a foreign key referencing `student_id` from the `Students` table.
- `subject_name` (varchar): The name of a subject, a foreign key referencing `subject_name` from the `Subjects` table.

## Task

Write an SQL query to find the number of times each student attended each exam.

## Example

Consider the following tables:

**Students table:**

| student_id | student_name |
|------------|--------------|
| 1          | Alice        |
| 2          | Bob          |
| 13         | John         |
| 6          | Alex         |

**Subjects table:**

| subject_name |
|--------------|
| Math         |
| Physics      |
| Programming  |

**Examinations table:**

| student_id | subject_name |
|------------|--------------|
| 1          | Math         |
| 1          | Physics      |
| 1          | Programming  |
| 2          | Programming  |
| 1          | Physics      |
| 1          | Math         |
| 13         | Math         |
| 13         | Programming  |
| 13         | Physics      |
| 2          | Math         |
| 1          | Math         |

Your SQL query should return the following result:

| student_id | student_name | subject_name | attended_exams |
|------------|--------------|--------------|----------------|
| 1          | Alice        | Math         | 3              |
| 1          | Alice        | Physics      | 2              |
| 1          | Alice        | Programming  | 1              |
| 2          | Bob          | Math         | 1              |
| 2          | Bob          | Physics      | 0              |
| 2          | Bob          | Programming  | 1              |
| 6          | Alex         | Math         | 0              |
| 6          | Alex         | Physics      | 0              |
| 6          | Alex         | Programming  | 0              |
| 13         | John         | Math         | 1              |
| 13         | John         | Physics      | 1              |
| 13         | John         | Programming  | 1              |

Explanation: 
- Alice attended the Math exam 3 times, the Physics exam 2 times, and the Programming exam 1 time.
- Bob attended the Math exam 1 time, the Programming exam 1 time, and did not attend the Physics exam.
- Alex did not attend any exams.
- John attended the Math exam 1 time, the Physics exam 1 time, and the Programming exam 1 time.

## Note

- The result table can be in any order.
