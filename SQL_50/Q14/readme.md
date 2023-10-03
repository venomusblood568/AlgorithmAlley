# Problem Statement: Confirmation Rate

## Table Schema

We have two tables:

### Signups

- `user_id` (integer): The unique identifier for each user.
- `time_stamp` (datetime): The timestamp when the user signed up.

### Confirmations

- `user_id` (integer): The ID of the user who requested a confirmation message.
- `time_stamp` (datetime): The timestamp when the confirmation message was requested.
- `action` (enum): The action taken on the confirmation message, either 'confirmed' or 'timeout'.

## Task

Write an SQL query to find the confirmation rate of each user.

## Example

Consider the following tables:

**Signups table:**

| user_id | time_stamp          |
|---------|---------------------|
| 3       | 2020-03-21 10:16:13 |
| 7       | 2020-01-04 13:57:59 |
| 2       | 2020-07-29 23:09:44 |
| 6       | 2020-12-09 10:39:37 |

**Confirmations table:**

| user_id | time_stamp          | action    |
|---------|---------------------|-----------|
| 3       | 2021-01-06 03:30:46 | timeout   |
| 3       | 2021-07-14 14:00:00 | timeout   |
| 7       | 2021-06-12 11:57:29 | confirmed |
| 7       | 2021-06-13 12:58:28 | confirmed |
| 7       | 2021-06-14 13:59:27 | confirmed |
| 2       | 2021-01-22 00:00:00 | confirmed |
| 2       | 2021-02-28 23:59:59 | timeout   |

Your SQL query should return the following result:

| user_id | confirmation_rate |
|---------|-------------------|
| 6       | 0.00              |
| 3       | 0.00              |
| 7       | 1.00              |
| 2       | 0.50              |

Explanation: 
- User 6 did not request any confirmation messages. The confirmation rate is 0.
- User 3 made 2 requests and both timed out. The confirmation rate is 0.
- User 7 made 3 requests and all were confirmed. The confirmation rate is 1.
- User 2 made 2 requests where one was confirmed and the other timed out. The confirmation rate is 1 / 2 = 0.5.

## Note

- Round the confirmation rate to two decimal places.
- The result table can be in any order.
