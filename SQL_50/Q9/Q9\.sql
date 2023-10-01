create database temperature; 

use temperature;

create table weather(
id int primary key,
recordDate date,
temperature int
);

insert into weather(id,recordDate,temperature)
values
(1  , "2015-01-01" , 10   ),
(2  , "2015-01-02" , 25),
(3  , "2015-01-03" , 20),
(4  , "2015-01-04" , 30 );

-- Select the ID of the weather records from the weather table where the temperature is higher than the temperature on the previous day.

-- Alias the weather table as w1 for the current date and w2 for the previous date.
SELECT w1.id AS Id

-- Start the JOIN operation: Match each record (w1) with its previous day's record (w2).
FROM weather w1
JOIN weather w2
-- Join condition: Compare the recordDate of w1 with the recordDate of the previous day (w2).
ON w1.recordDate = DATE_ADD(w2.recordDate, INTERVAL 1 DAY)

-- Filter the results: Select rows where the temperature of the current date (w1) is greater than the temperature of the previous day (w2).
WHERE w1.temperature > w2.temperature;

