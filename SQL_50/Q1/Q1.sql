CREATE DATABASE COMPANY;

use COMPANY;

CREATE table Products(
product_id int primary key,
low_fats varchar(50),
recyclable varchar(50)
);

insert into Products(product_id,low_fats,recyclable)
values 
(0,"Y","N"),
(1,"Y","Y"),
(2,"N","Y"),
(3,"Y","Y"),
(4,"N","N");

select * from Products;

select product_id from Products WHERE low_fats = "Y" AND recyclable = "Y";