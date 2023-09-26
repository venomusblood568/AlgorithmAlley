# Problem Statement: Recyclable and Low Fat Products

## Table Schema

We have a table named `Products` with the following columns:

- `product_id` (integer): The primary key for this table with unique values.
- `low_fats` (enum): A category field with values ('Y' or 'N'), where 'Y' indicates that a product is low fat and 'N' indicates that it is not.
- `recyclable` (enum): Another category field with values ('Y' or 'N'), where 'Y' indicates that a product is recyclable and 'N' indicates that it is not.

## Task

Write a SQL query to find the IDs of products that are both low fat and recyclable. In other words, you need to identify products that have a 'low_fats' value of 'Y' and a 'recyclable' value of 'Y'.

## Example

Consider the following `Products` table:

| product_id  | low_fats | recyclable |
|-------------|----------|------------|
| 0           | Y        | N          |
| 1           | Y        | Y          |
| 2           | N        | Y          |
| 3           | Y        | Y          |
| 4           | N        | N          |

Your SQL query should return the following result:

| product_id  |
|-------------|
| 1           |
| 3           |

Explanation: Only products with IDs 1 and 3 are both low fat and recyclable.

## Note

- The order of the output result is not important.
