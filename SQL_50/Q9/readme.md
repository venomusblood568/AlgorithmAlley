# Problem Statement: Rising Temperature

## Table Schema

We have a table named `Weather` with the following columns:

- `id` (integer): The primary key column with unique values for each record.
- `recordDate` (date): The date of the record.
- `temperature` (integer): The temperature on that day.

## Task

Write an SQL query to find all dates' `id` with higher temperatures compared to its previous dates (yesterday).

## Example

Consider the following `Weather` table:

| id | recordDate  | temperature |
|----|-------------|-------------|
| 1  | 2015-01-01  | 10          |
| 2  | 2015-01-02  | 25          |
| 3  | 2015-01-03  | 20          |
| 4  | 2015-01-04  | 30          |

Your SQL query should return the following result:

| id |
|----|
| 2  |
| 4  |

Explanation: 
- On `2015-01-02`, the temperature was higher than the previous day (10 -> 25).
- On `2015-01-04`, the temperature was higher than the previous day (20 -> 30).

## Note

- The result table can be in any order.
