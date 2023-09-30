# Problem Statement: Replace Employee ID With The Unique Identifier

## Table Schema

We have two tables:

### Employees

- `id` (integer): The primary key column for identifying employees.
- `name` (varchar): The name of the employee.

### EmployeeUNI

- `id` (integer): The ID of the employee.
- `unique_id` (integer): The unique identifier corresponding to the employee.

`(id, unique_id)` is the primary key for the `EmployeeUNI` table, indicating a unique combination of `id` and `unique_id`.

## Task

Write an SQL query to show the unique ID of each employee. If an employee does not have a unique ID, replace it with `null`.

## Example

Consider the following tables:

**Employees table:**

| id | name     |
|----|----------|
| 1  | Alice    |
| 7  | Bob      |
| 11 | Meir     |
| 90 | Winston  |
| 3  | Jonathan |

**EmployeeUNI table:**

| id | unique_id |
|----|-----------|
| 3  | 1         |
| 11 | 2         |
| 90 | 3         |

Your SQL query should return the following result:

| unique_id | name     |
|-----------|----------|
| null      | Alice    |
| null      | Bob      |
| 2         | Meir     |
| 3         | Winston  |
| 1         | Jonathan |

Explanation: 
- Alice and Bob do not have a unique ID, so we show `null` instead.
- The unique ID of Meir is 2.
- The unique ID of Winston is 3.
- The unique ID of Jonathan is 1.

## Note

- The order of the result is not important.
