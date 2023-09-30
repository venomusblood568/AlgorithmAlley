CREATE DATABASE PANDA;		

USE PANDA;	

CREATE TABLE Employees(
id int primary key ,
name varchar(50)
);

create table EmployeeUNI(
id int primary key,
unique_id int 
);

insert into Employees
(id,name)
values
(1  , "Alice"),
(7  , "Bob "),
(11 , "Meir" ),
(90 , "Winston"),
(3  , "Jonathan");

insert into EmployeeUNI
(id,unique_id)
values
(3,1),
(11,2),
(90,3);

select unique_id , name from Employees as em
left join EmployeeUNI as emuni
on em.id = emuni.id
