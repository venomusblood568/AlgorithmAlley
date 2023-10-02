create database school;

use school;

create table Student(
student_id int primary key,
student_name varchar(50)
);

create table Subject(
subject_name varchar(50)
);

create table Examination(
student_id int,
subject_name varchar(50)
);

insert into Student(student_id,student_name)
values
(1,"Alice"),
(2,"Bob"),
(13,"John"),
(6,"Alex");

insert into Subject(subject_name)
values 
("Math"),
("Physics"),
("Programming");

insert into Examination(student_id,subject_name)
values
(1,"Math"),
(1,"Physics"),
(1,"Programming"),
(2,"Programming"),
(1,"Physics"),
(1,"Math"),
(13,"Math"),
(13,"Programming"),
(13,"Physics"),
(2,"Math"),
(1,"Math");

SELECT s.student_id,
s.student_name,
sub.subject_name,
COUNT(e.student_id) AS attended_exams
FROM Student s
CROSS JOIN Subject sub
LEFT JOIN Examination e
ON s.student_id = e.student_id AND sub.subject_name = e.subject_name
GROUP BY s.student_id, s.student_name, sub.subject_name
ORDER BY s.student_id, sub.subject_name;

