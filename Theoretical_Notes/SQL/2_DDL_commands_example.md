# **DDL COMMANDS EXAMPLES**

<br>

```
COMMAND: create table empinfo(eid int primary key, firstname varchar(20), lastname varchar(20), department varchar(20), salary int);
RESULT: Table named empinfo has been created, check via 'show tables;'.

OUTPUT:
Query OK, 0 rows affected (0.07 sec)
```

<hr>

```
COMMAND: show tables;
RESULT: Shown existing table named 'empinfo'.

OUTPUT:
+---------------+
| Tables_in_db1 |
+---------------+
| empinfo       |
+---------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: desc empinfo;
RESULT: Shown the 'empinfo' table's details.

OUTPUT:
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| eid        | int         | NO   | PRI | NULL    |       |
| firstname  | varchar(20) | YES  |     | NULL    |       |
| lastname   | varchar(20) | YES  |     | NULL    |       |
| department | varchar(20) | YES  |     | NULL    |       |
| salary     | int         | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
5 rows in set (0.01 sec)
```

<hr>

```
COMMAND: ?
RESULT: Rename

OUTPUT:
```

<hr>

```
COMMAND: drop table empinfo;
RESULT: Table 'empinfo' has been deleted.

OUTPUT:
Query OK, 0 rows affected (0.04 sec)
```
