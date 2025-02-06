create database Employee;
use Employee;
show databases;
create table login(username varchar(20), password varchar(20));
insert into login values('admin','12345');
use Employee;
select *from employee;
create table employee(
name varchar(20),
fname varchar(20),
dob varchar(20),
salary varchar(20),
address varchar(20),
phone varchar(20),
Email varchar(40),
education varchar(20),
designation varchar(30),
aadhar varchar(25),
Emp_id varchar(20)
);
---
use Employee;
select * from employee;

drop table employee