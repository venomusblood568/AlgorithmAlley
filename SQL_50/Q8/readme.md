# Problem Statement: Customer Who Visited but Did Not Make Any Transactions

## Table Schema

We have two tables:

### Visits

- `visit_id` (integer): The unique identifier for each visit.
- `customer_id` (integer): The ID of the customer who visited the mall.

### Transactions

- `transaction_id` (integer): The unique identifier for each transaction.
- `visit_id` (integer): The ID of the visit during which the transaction was made.
- `amount` (integer): The amount of the transaction made during the visit.

## Task

Write an SQL query to find the IDs of the customers who visited without making any transactions and the number of times they made these types of visits.

## Example

Consider the following tables:

**Visits table:**

| visit_id | customer_id |
|----------|-------------|
| 1        | 23          |
| 2        | 9           |
| 4        | 30          |
| 5        | 54          |
| 6        | 96          |
| 7        | 54          |
| 8        | 54          |

**Transactions table:**

| transaction_id | visit_id | amount |
|----------------|----------|--------|
| 2              | 5        | 310    |
| 3              | 5        | 300    |
| 9              | 5        | 200    |
| 12             | 1        | 910    |
| 13             | 2        | 970    |

Your SQL query should return the following result:

| customer_id | count_no_trans |
|-------------|----------------|
| 54          | 2              |
| 30          | 1              |
| 96          | 1              |

Explanation: 
- Customer with `customer_id = 23` visited the mall once and made one transaction during the visit with `visit_id = 12`.
- Customer with `customer_id = 9` visited the mall once and made one transaction during the visit with `visit_id = 13`.
- Customer with `customer_id = 30` visited the mall once and did not make any transactions.
- Customer with `customer_id = 54` visited the mall three times. During 2 visits they did not make any transactions, and during one visit they made 3 transactions.
- Customer with `customer_id = 96` visited the mall once and did not make any transactions.

## Note

- The result should be sorted in any order.
