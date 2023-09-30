# Problem Statement: Invalid Tweets

## Table Schema

We have a table named `Tweets` with the following columns:

- `tweet_id` (integer): The primary key column for identifying tweets.
- `content` (varchar): The content of the tweet.

## Task

Write an SQL query to find the IDs of the invalid tweets. A tweet is invalid if the number of characters used in the content of the tweet is strictly greater than 15.

## Example

Consider the following `Tweets` table:

| tweet_id | content                          |
|----------|----------------------------------|
| 1        | Vote for Biden                   |
| 2        | Let us make America great again! |

Your SQL query should return the following result:

| tweet_id |
|----------|
| 2        |

Explanation: Tweet 1 has a length of 14, making it a valid tweet. Tweet 2 has a length of 32, making it an invalid tweet.

## Note

- The order of the result is not important.
