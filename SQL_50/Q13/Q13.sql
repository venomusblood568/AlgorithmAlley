CREATE DATABASE BLACK;

use black;

create table Employee( 
id int primary key,
name varchar(50),
department varchar (50),
managerId int
);

insert into Employee (id,name,department,managerID)
values
(101 , "John" , " A"          , NULL),
(102 , "Dan"   , "A "         , 101 ),
( 103 ," James" ," A"          , 101  ),
(104 , "Amy"   ,"A"         , 101),
( 105 , "Anne"  , "A"         , 101 ),
(106 , "Ron"   ,"B"         ,  101 );

select name 
from Employee 
where id in (select managerID from employee group by managerId having count(*)>=5);
