create database if not exists movieDB;
use moviedb;
create table movie(
title varchar(40),
budget_in_millions int,
release_date date,
revenue_in_millions int,
rating_average float);
desc movie;
insert into movie values("Avatar",237,'2009-12-10',278,7.2);
insert into movie values("Titanic",200,'1997-11-18',185,7.5);
insert into movie values("The Avengers",220,'2012-04-25',152,7.4);
insert into movie values("jurassic world",150,'2015-06-09',151,6.5);
insert into movie values("Furious 7",190,'2015-04-01',150,7.3);
insert into movie values("The Avengers:Age of ultron",280,'2015-04-22',141,7.3);
insert into movie values("Iron man 3",200,'2013-04-18',122,6.8);
insert into movie values("Minions",74,'2015-06-17',11,6.4);
insert into movie values("captain America:civil war",250,'2016-04-27',115,7.1);
insert into movie values("Transformers:Dark of the moon",195,'2011-06-28',112,6.1);
select * from movie;
select title from movie;
select title from movie where title="jurassic world" and rating_average=6.5;
select title from movie where rating_average>7;
select title from movie where title="the avengers";
select title,rating_average from movie where rating_average between 7 and 8;
select title from movie where budget_in_millions>250;
select title,rating_average from movie where revenue_in_millions between 150 and 200; 
select title,release_date from movie where title like 't%';
select sum(revenue_in_millions) from movie;
select title,revenue_in_millions from movie where revenue_in_millions=(select min(revenue_in_millions) from movie);
