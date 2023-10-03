# Problem Statement: Managers with at Least 5 Direct Reports

## Table Schema

We have one table:

### Employee

- `id` (integer): The unique identifier for each employee.
- `name` (varchar): The name of the employee.
- `department` (varchar): The department where the employee works.
- `managerId` (int): The ID of the manager for the employee. If null, the employee does not have a manager.

## Task

Write an SQL query to find managers with at least five direct reports.

## Example

Consider the following table:

**Employee table:**

| id  | name  | department | managerId |
|-----|-------|------------|-----------|
| 101 | John  | A          | None      |
| 102 | Dan   | A          | 101       |
| 103 | James | A          | 101       |
| 104 | Amy   | A          | 101       |
| 105 | Anne  | A          | 101       |
| 106 | Ron   | B          | 101       |

Your SQL query should return the following result:

| name |
|------|
| John |

Explanation: 
- John is the only manager with at least five direct reports (Dan, James, Amy, Anne, and Ron).

## Note

- The result table can be in any order.
