create database article;

use article;

create table Views(
article_id int,
author_id int,
viewer_id int,
view_date date
);

insert into views
(article_id , author_id , viewer_id , view_date )
values
(1, 3, 5,"2019-08-01"),
(1,3,6, "2019-08-02"),
(2, 7, 7,"2019-08-01"),
(2,7,6,"2019-08-02"),
(4,7,1,"2019-07-22"),
(3,4,4,"2019-07-2"),
(3,4,4,"2019-07-21");

select * from views;

SELECT DISTINCT author_id as id
FROM Views
WHERE author_id = viewer_id
ORDER BY id ASC;
