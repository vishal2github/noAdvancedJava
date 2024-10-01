# DML COMMANDS EXAMPLE

```
COMMAND: insert into empinfo(eid, firstname, lastname, department, salary) values(101, 'Amit', 'Singh', 'Sales', 60000);
RESULT: One record entry added.

OUTPUT:
Query OK, 1 row affected (0.02 sec)
```

<hr>

```
COMMAND: insert into empinfo values(101, 'Amit', 'Singh', 'Sales', 60000);
RESULT: Alternate of above command but depends upon table-columns.

OUTPUT:
ERROR 1062 (23000): Duplicate entry '101' for key 'empinfo.PRIMARY'
```

<hr>

```
COMMAND: insert into empinfo values(102, 'Amit', 'Singh', 'Sales', 60000);
RESULT: Primary key value changed to add another entry and make it work.

OUTPUT:
Query OK, 1 row affected (0.01 sec)
```

<hr>

```
COMMAND: update empinfo set firstname = 'Rakesh', lastname = 'Mishra', salary = 70000 where eid = 102;
RESULT: Record at particular primary key 'eid' 102 has been updated (changed).

OUTPUT:
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0
```

<hr>

```
COMMANDS: delete from empinfo where eid = 102;
RESULT: Table record/row with eid 102 has been deleted.

OUTPUT:
Query OK, 1 row affected (0.01 sec)
```
