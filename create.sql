create database para
character set utf8
collate utf8_hungarian_ci;
 
grant all privileges 
on para.*
to para@localhost
identified by 'titok';
 
use para;
 
create table employees (
    id int not null primary key auto_increment,
    name varchar(50),
    city varchar(50),
    salary double,
    birth date
);