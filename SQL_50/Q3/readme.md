## Problem Statement

Table: World

| Column Name | Type    |
|-------------|---------|
| name        | varchar |
| continent   | varchar |
| area        | int     |
| population  | int     |
| gdp         | bigint  |

name is the primary key (column with unique values) for this table. Each row of this table gives information about the name of a country, the continent to which it belongs, its area, the population, and its GDP value.

A country is big if:

1. It has an area of at least three million (i.e., 3,000,000 km²), or
2. It has a population of at least twenty-five million (i.e., 25,000,000).

Write a SQL query to find the name, population, and area of the big countries.

Return the result table in any order.

## Example

Input: 
World table:

| name        | continent | area    | population | gdp          |
|-------------|-----------|---------|------------|--------------|
| Afghanistan | Asia      | 652,230 | 25,500,100 | 20,343,000,000  |
| Albania     | Europe    | 28,748  | 2,831,741  | 12,960,000,000  |
| Algeria     | Africa    | 2,381,741 | 37,100,000 | 188,681,000,000 |
| Andorra     | Europe    | 468     | 78,115     | 3,712,000,000   |
| Angola      | Africa    | 1,246,700 | 20,609,294 | 100,990,000,000 |

Output: 

| name        | population | area    |
|-------------|------------|---------|
| Afghanistan | 25,500,100 | 652,230 |
| Algeria     | 37,100,000 | 2,381,741 |
