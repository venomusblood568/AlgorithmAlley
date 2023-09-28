# Problem Statement: Find Customer Referee

## Table Schema

We have a table named `Customer` with the following columns:

- `id` (integer): The primary key column for identifying customers.
- `name` (varchar): The name of the customer.
- `referee_id` (integer): The ID of the customer who referred them, if any.

## Task

Write an SQL query to find the names of customers who were not referred by the customer with ID = 2.

## Example

Consider the following `Customer` table:

| id | name | referee_id |
|----|------|------------|
| 1  | Will | null       |
| 2  | Jane | null       |
| 3  | Alex | 2          |
| 4  | Bill | null       |
| 5  | Zack | 1          |
| 6  | Mark | 2          |

Your SQL query should return the following result:

| name |
|------|
| Will |
| Jane |
| Bill |
| Zack |

Explanation: The customers with names 'Will', 'Jane', 'Bill', and 'Zack' were not referred by the customer with ID = 2.

## Note

- The order of the result is not important.
