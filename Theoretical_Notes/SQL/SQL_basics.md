# SQL (Structured Query Language) BASICS

+ 'SQL' stands for Structured Query Language.
+ It is not a case-sensitive language.
+ Queries can be created for database server by using 'SQL'.
+ These queries will be executed by database server(s) (like, mySql, Oracle, etc).

+ These queries can be divided into three categories:
  + DDL (Data Definition Language)
  + DML (Data Manipulation Language)
  + DQL (Data Query Language)
  + etc...

+ To reduce data redundancy (data repeatition/duplicacy), normalization technique is used via some scitific rules/methods named as 'normal forms'.
+ Normalization is, rather keeping entire data in one table, the data is divided into several separate tables.

<br>

### DDL (Data Definition Language)

+ DDL includes operations like:
  + Create table
  + Alter table
  + Drop table
  + Truncate table
  + etc...

<br>

### DML (Data Manipulation Language)

+ DML includes operations like:
  + Insert into
  + Delete from
  + Update
  + etc...

<br>

### DQL (Data Query Language)

+ DQL includes operations like:
  + Select
  + etc...

<br>

### Working Commands

+ DB commands
  + **show databases;** *(Displays all the created databases)*
  + **create database *db_name*;** *(Creates the database)*
  + **drop database *db_name*;** *(Deletes the specific   database)*
  + **use *db_name*;** *(Uses the specific database)*

+ DDL Commands
  + **show tables;** *(Shows the specific table)*
  + **create table *table_name*(*parameter_heads*);** *(Uses the specific database)*
  + **show tables;** *(Shows all the tables in database)*
  + **desc *table_name*;** *(Shows the table description/details)*
  + **alter table;** *(Alters the specific table)*
  + **drop table *table_name*;** *(Deletes the specific table)*

  + **truncate table;** *(Uses the specific database)*
  + etc...

+ DML Commands
  + **insert into *table_name*(*parameters_heads*) values(*parameters_values*)** *(Inserts the data)*
  + **update *table_name* set firstname='Rakesh', lastname='Loli', salary=34323 where eid=234;** *(To update records)*
  + **delete from *table_name* where eid=678;** *(Deletes particular record)*
  + **truncate *table_name*;** *(Deletes all records at once)*

+ DQL Command
  + __select * from *table_name*;__ *(Shows table's all entities)*
  + __select firstname, salary from *table_name*;__ *(Shows a table's particular entity(ise))*
