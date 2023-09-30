create database company_XYZ;

use company_XYZ;

create table sales(
sales_id int primary key,
product_id int,
year int,
quantity int,
price int
);

create table product(
product_id int primary key,
product_name varchar(50)
);

INSERT into sales(sales_id,product_id,year,quantity,price)
values
(1,100,2008,10,5000),
(2,100,2009,12,5000),
(7,200,2011,15,9000);

Insert into product(product_id,product_name)
values
(100,"Nokia"),
(200,"Apple"),
(300,"Samsung");

select product_name ,year ,price  from sales as S
left join product as P
on S.product_id = P.product_id;
