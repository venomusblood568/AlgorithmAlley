# Problem Statement: Product Sales Analysis I

## Table Schema

We have two tables:

### Sales

- `sale_id` (integer): The primary key for identifying each sale, in combination with the `year`.
- `product_id` (integer): The ID of the product being sold. (Foreign key reference to Product table)
- `year` (integer): The year of the sale.
- `quantity` (integer): The quantity of the product sold.
- `price` (integer): The price per unit of the product.

### Product

- `product_id` (integer): The primary key for identifying each product.
- `product_name` (varchar): The name of the product.

## Task

Write an SQL query to report the `product_name`, `year`, and `price` for each `sale_id` in the `Sales` table.

## Example

Consider the following tables:

**Sales table:**

| sale_id | product_id | year | quantity | price |
|---------|------------|------|----------|-------|
| 1       | 100        | 2008 | 10       | 5000  |
| 2       | 100        | 2009 | 12       | 5000  |
| 7       | 200        | 2011 | 15       | 9000  |

**Product table:**

| product_id | product_name |
|------------|--------------|
| 100        | Nokia        |
| 200        | Apple        |
| 300        | Samsung      |

Your SQL query should return the following result:

| product_name | year  | price |
|--------------|-------|-------|
| Nokia        | 2008  | 5000  |
| Nokia        | 2009  | 5000  |
| Apple        | 2011  | 9000  |

Explanation: 
- From `sale_id = 1`, we can conclude that Nokia was sold for 5000 in the year 2008.
- From `sale_id = 2`, we can conclude that Nokia was sold for 5000 in the year 2009.
- From `sale_id = 7`, we can conclude that Apple was sold for 9000 in the year 2011.

## Note

- The order of the result is not important.
