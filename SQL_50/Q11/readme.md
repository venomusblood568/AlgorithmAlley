# Problem Statement: Employee Bonus

## Table Schema

We have two tables:

### Employee

- `empId` (integer): The unique identifier for each employee.
- `name` (varchar): The name of the employee.
- `supervisor` (integer): The ID of the manager/supervisor of the employee.
- `salary` (integer): The salary of the employee.

### Bonus

- `empId` (integer): The ID of an employee, a foreign key referencing `empId` from the `Employee` table.
- `bonus` (integer): The bonus amount given to the employee.

## Task

Write an SQL query to report the `name` and `bonus` amount of each employee with a bonus less than 1000.

## Example

Consider the following tables:

**Employee table:**

| empId | name   | supervisor | salary |
|-------|--------|------------|--------|
| 3     | Brad   | null       | 4000   |
| 1     | John   | 3          | 1000   |
| 2     | Dan    | 3          | 2000   |
| 4     | Thomas | 3          | 4000   |

**Bonus table:**

| empId | bonus |
|-------|-------|
| 2     | 500   |
| 4     | 2000  |

Your SQL query should return the following result:

| name   | bonus |
|--------|-------|
| Brad   | null  |
| John   | null  |
| Dan    | 500   |

Explanation: 
- Brad and John don't have bonuses.
- Dan has a bonus of 500.
- Thomas has a bonus of 2000, which is above 1000 and hence not included in the result.

## Note

- The result table can be in any order.
- The `bonus` column values are null for employees who don't have a bonus.
