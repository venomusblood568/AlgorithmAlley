create database black_company;

use black_company;

create table Employee(
empId  int primary key,
name varchar(50),
supervisor int,
salary    int
);

create table bonus(
 empId int ,
 bonus int
);

insert into Employee(empID,name ,supervisor,salary)
values 
(3     , " Brad "  , null , 4000 ),
(1     , "John "  ,3  ,1000 ),
(2     , "Dan"   ,3          , 2000 ),
(4     , "Thomas" ,3  ,         4000 );

insert into bonus( empId , bonus)values 
(2  ,    500),
(4     ,2000 );

SELECT e.name, b.bonus
FROM employee e
LEFT JOIN bonus b
ON e.empId = b.empId
WHERE IFNULL(b.bonus, 0) < 1000;