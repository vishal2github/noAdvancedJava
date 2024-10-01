# DQL COMMANDS EXAMPLE

```
COMMAND: select * from empinfo;
RESULT: Existing table records shown.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 101 | Amit      | Singh    | Sales      |  60000 |
| 102 | Manoj     | Mishra   | Sales      |  20000 |
| 103 | Ravi      | Yadav    | Marketing  |  40000 |
| 104 | Amisha    | Arora    | Marketing  |  44000 |
+-----+-----------+----------+------------+--------+
4 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select firstname, department from empinfo;
RESULT: Shown all records from firstname, and department columns only.

OUTPUT:
+-----------+------------+
| firstname | department |
+-----------+------------+
| Amit      | Sales      |
| Manoj     | Sales      |
| Ravi      | Marketing  |
| Amisha    | Marketing  |
+-----------+------------+
4 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where eid = 103;
RESULT: Shown records of eid 103 only.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 103 | Ravi      | Yadav    | Marketing  |  40000 |
+-----+-----------+----------+------------+--------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select firstname, department from empinfo where eid = 103;
RESULT: Shown firstname, and department columns of eid 103 only.

OUTPUT:
+-----------+------------+
| firstname | department |
+-----------+------------+
| Ravi      | Marketing  |
+-----------+------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where department = 'Marketing';
RESULT: Shown all records related to Marketing department only.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 103 | Ravi      | Yadav    | Marketing  |  40000 |
| 104 | Amisha    | Arora    | Marketing  |  44000 |
+-----+-----------+----------+------------+--------+
2 rows in set (0.00 sec)
```

<hr>

```
COMMAND: 
RESULT: 

OUTPUT:

```
