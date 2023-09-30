# Problem Statement: Article Views I

## Table Schema

We have a table named `Views` with the following columns:

- `article_id` (integer): The ID of the article being viewed.
- `author_id` (integer): The ID of the author who wrote the article.
- `viewer_id` (integer): The ID of the viewer who viewed the article.
- `view_date` (date): The date on which the article was viewed.

Each row of this table indicates that a viewer viewed an article (written by some author) on a specific date.

Note: Equal `author_id` and `viewer_id` indicate the same person.

## Task

Write an SQL query to find all the authors who viewed at least one of their own articles. Return the result table sorted by `id` in ascending order.

## Example

Consider the following `Views` table:

| article_id | author_id | viewer_id | view_date  |
|------------|-----------|-----------|------------|
| 1          | 3         | 5         | 2019-08-01 |
| 1          | 3         | 6         | 2019-08-02 |
| 2          | 7         | 7         | 2019-08-01 |
| 2          | 7         | 6         | 2019-08-02 |
| 4          | 7         | 1         | 2019-07-22 |
| 3          | 4         | 4         | 2019-07-21 |
| 3          | 4         | 4         | 2019-07-21 |

Your SQL query should return the following result:

| id   |
|------|
| 4    |
| 7    |

Explanation: Authors with IDs 4 and 7 viewed at least one of their own articles.

## Note

- The result table should be sorted by `id` in ascending order.
