create database panda_company;

use panda_company;

create table Visits(
visit_id int,
customer_id int
); 

create table Transaction(
transaction_id int,
visit_id int,
amount int
);

insert into Visits
(visit_id,customer_id) 
values
(1,23),
(2,9),
(4,30),
(5,54),
(6,96),
(7,54),
(8,54);

insert into Transaction(transaction_id,visit_id,amount)
values
(2,5,310),
(3,5,300),
(9,5,200),
(12,1,910),
(13,2,970);

SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits v
LEFT JOIN Transaction t
ON v.visit_id = t.visit_id
WHERE t.visit_id IS NULL
OR t.amount IS NULL
GROUP BY v.customer_id;


/* THIS ONE IS USE FOR LEETCODE SOLUTION BUT BOTH WORKS JUST FINE
 SELECT v.customer_id,count(*) AS count_no_trans FROM Visits v
LEFT JOIN Transactions t
ON v.visit_id=t.visit_id
WHERE t.amount IS NULL
GROUP BY 1*/