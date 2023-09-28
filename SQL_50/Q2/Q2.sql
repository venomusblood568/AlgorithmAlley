CREATE DATABASE XYZ;

USE XYZ;

CREATE TABLE Customer(
id int primary key, 
name varchar(50),
referee_id int
);

insert into Customer
(id,name,referee_id)
values 
(1,"Will",null),
(2,"Jane",null),
(3,"Alex",2),
(4,"Bill ",null),
(5,"Zack",1),
(6,"Mark",2);


SELECT name from Customer where referee_id IS NULL or referee_id <> 2;
SELECT c1.name
FROM Customer c1
LEFT JOIN Customer c2 ON c1.referee_id = c2.id
WHERE c2.id IS NULL OR c2.id <> 2;
