create database invalid_tweets;

use invalid_tweets;

create table tweets(
tweet_id int primary key,
content varchar(500)
);

insert into tweets
(tweet_id,content)
values 
(1,"Vote for Biden"),
(2,"Let us make America great again!");

SELECT tweet_id
FROM tweets
WHERE CHAR_LENGTH(content) > 15;