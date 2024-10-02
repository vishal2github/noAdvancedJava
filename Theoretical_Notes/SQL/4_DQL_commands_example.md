# DQL COMMANDS EXAMPLE

```
COMMAND: select * from empinfo;
RESULT: Existing table records shown.

OUTPUT:
+-----+-----------+-------------+------------+--------+
| eid | firstname | lastname    | department | salary |
+-----+-----------+-------------+------------+--------+
| 101 | Amit      | Singh       | Sales      |  60000 |
| 102 | Manoj     | Mishra      | Sales      |  20000 |
| 103 | Ravi      | Yadav       | Marketing  |  40000 |
| 104 | Amisha    | Arora       | Marketing  |  44000 |
| 105 | Rakesh    | Kumar       | NULL       |   NULL |
| 106 | Alok      | Tiwari      | Marketing  |  99443 |
| 107 | Suman     | Singh       | Training   |  39000 |
| 108 | Akash     | Saxena      | Training   |  39000 |
| 109 | Ritesh    | Shrivastava | Sales      |  57000 |
| 110 | Suresh    | Awasthi     | Marketing  |  84000 |
| 111 | Kushagra  | Goel        | Marketing  |  75000 |
| 112 | Abha      | Rastogi     | Accounts   |  35000 |
+-----+-----------+-------------+------------+--------+
12 rows in set (0.00 sec)
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
| Rakesh    | NULL       |
| Alok      | Marketing  |
| Suman     | Training   |
| Akash     | Training   |
| Ritesh    | Sales      |
| Suresh    | Marketing  |
| Kushagra  | Marketing  |
| Abha      | Accounts   |
+-----------+------------+
12 rows in set (0.00 sec)
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
| 106 | Alok      | Tiwari   | Marketing  |  99443 |
| 110 | Suresh    | Awasthi  | Marketing  |  84000 |
| 111 | Kushagra  | Goel     | Marketing  |  75000 |
+-----+-----------+----------+------------+--------+
5 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo order by salary asc;
RESULT: All table records has been ascendingly ordered by salary and shown. 

OUTPUT:
+-----+-----------+-------------+------------+--------+
| eid | firstname | lastname    | department | salary |
+-----+-----------+-------------+------------+--------+
| 105 | Rakesh    | Kumar       | NULL       |   NULL |
| 102 | Manoj     | Mishra      | Sales      |  20000 |
| 112 | Abha      | Rastogi     | Accounts   |  35000 |
| 107 | Suman     | Singh       | Training   |  39000 |
| 108 | Akash     | Saxena      | Training   |  39000 |
| 103 | Ravi      | Yadav       | Marketing  |  40000 |
| 104 | Amisha    | Arora       | Marketing  |  44000 |
| 109 | Ritesh    | Shrivastava | Sales      |  57000 |
| 101 | Amit      | Singh       | Sales      |  60000 |
| 111 | Kushagra  | Goel        | Marketing  |  75000 |
| 110 | Suresh    | Awasthi     | Marketing  |  84000 |
| 106 | Alok      | Tiwari      | Marketing  |  99443 |
+-----+-----------+-------------+------------+--------+
12 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo order by salary desc;
RESULT: All table records has been descendingly ordered by salary and shown. 

OUTPUT:
+-----+-----------+-------------+------------+--------+
| eid | firstname | lastname    | department | salary |
+-----+-----------+-------------+------------+--------+
| 106 | Alok      | Tiwari      | Marketing  |  99443 |
| 110 | Suresh    | Awasthi     | Marketing  |  84000 |
| 111 | Kushagra  | Goel        | Marketing  |  75000 |
| 101 | Amit      | Singh       | Sales      |  60000 |
| 109 | Ritesh    | Shrivastava | Sales      |  57000 |
| 104 | Amisha    | Arora       | Marketing  |  44000 |
| 103 | Ravi      | Yadav       | Marketing  |  40000 |
| 107 | Suman     | Singh       | Training   |  39000 |
| 108 | Akash     | Saxena      | Training   |  39000 |
| 112 | Abha      | Rastogi     | Accounts   |  35000 |
| 102 | Manoj     | Mishra      | Sales      |  20000 |
| 105 | Rakesh    | Kumar       | NULL       |   NULL |
+-----+-----------+-------------+------------+--------+
12 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo order by firstname desc;
RESULT: All table records has been descendingly ordered by firstname and shown. 

OUTPUT:
+-----+-----------+-------------+------------+--------+
| eid | firstname | lastname    | department | salary |
+-----+-----------+-------------+------------+--------+
| 110 | Suresh    | Awasthi     | Marketing  |  84000 |
| 107 | Suman     | Singh       | Training   |  39000 |
| 109 | Ritesh    | Shrivastava | Sales      |  57000 |
| 103 | Ravi      | Yadav       | Marketing  |  40000 |
| 105 | Rakesh    | Kumar       | NULL       |   NULL |
| 102 | Manoj     | Mishra      | Sales      |  20000 |
| 111 | Kushagra  | Goel        | Marketing  |  75000 |
| 101 | Amit      | Singh       | Sales      |  60000 |
| 104 | Amisha    | Arora       | Marketing  |  44000 |
| 106 | Alok      | Tiwari      | Marketing  |  99443 |
| 108 | Akash     | Saxena      | Training   |  39000 |
| 112 | Abha      | Rastogi     | Accounts   |  35000 |
+-----+-----------+-------------+------------+--------+
12 rows in set (0.00 sec)

```

<hr>

```
COMMAND: select * from empinfo limit 4;
RESULT: Only top 4 records displayed. Here, 4 is fetch-index.

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
COMMAND: select * from empinfo limit 3, 4;
RESULT: 3 will be fetch position, 4 is fetch-size. Displayed 4 records from 3rd fetch-index.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 104 | Amisha    | Arora    | Marketing  |  44000 |
| 105 | Rakesh    | Kumar    | NULL       |   NULL |
| 106 | Alok      | Tiwari   | Marketing  |  99443 |
| 107 | Suman     | Singh    | Training   |  39000 |
+-----+-----------+----------+------------+--------+
4 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo order by salary desc limit 3;
RESULT: Shown top 3 high salaried records.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 106 | Alok      | Tiwari   | Marketing  |  99443 |
| 110 | Suresh    | Awasthi  | Marketing  |  84000 |
| 111 | Kushagra  | Goel     | Marketing  |  75000 |
+-----+-----------+----------+------------+--------+
3 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where salary > 70000;
RESULT: Records shown of having salary greater than 70k.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 106 | Alok      | Tiwari   | Marketing  |  99443 |
| 110 | Suresh    | Awasthi  | Marketing  |  84000 |
| 111 | Kushagra  | Goel     | Marketing  |  75000 |
+-----+-----------+----------+------------+--------+
3 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where salary >= 50000 and salary <= 70000;
RESULT: Shows records having salary between 50k to 70k.

OUTPUT:
+-----+-----------+-------------+------------+--------+
| eid | firstname | lastname    | department | salary |
+-----+-----------+-------------+------------+--------+
| 101 | Amit      | Singh       | Sales      |  60000 |
| 109 | Ritesh    | Shrivastava | Sales      |  57000 |
+-----+-----------+-------------+------------+--------+
2 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where salary between 50000 and 70000;
RESULT: Shows records having salary between 50k to 70k.

OUTPUT:
+-----+-----------+-------------+------------+--------+
| eid | firstname | lastname    | department | salary |
+-----+-----------+-------------+------------+--------+
| 101 | Amit      | Singh       | Sales      |  60000 |
| 109 | Ritesh    | Shrivastava | Sales      |  57000 |
+-----+-----------+-------------+------------+--------+
2 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where department = 'marketing' and salary > 70000;
RESULT: Shown records with department marketing and salary greater than 70k.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 106 | Alok      | Tiwari   | Marketing  |  99443 |
| 110 | Suresh    | Awasthi  | Marketing  |  84000 |
| 111 | Kushagra  | Goel     | Marketing  |  75000 |
+-----+-----------+----------+------------+--------+
3 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where department = 'marketing' order by salary desc limit 3;
RESULT: Shown top 3 records having department marketing with highest salary.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 106 | Alok      | Tiwari   | Marketing  |  99443 |
| 110 | Suresh    | Awasthi  | Marketing  |  84000 |
| 111 | Kushagra  | Goel     | Marketing  |  75000 |
+-----+-----------+----------+------------+--------+
3 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where department = 'marketing' or department = 'sales';
RESULT: Shown records from sales and marketing department only.

OUTPUT:
+-----+-----------+-------------+------------+--------+
| eid | firstname | lastname    | department | salary |
+-----+-----------+-------------+------------+--------+
| 101 | Amit      | Singh       | Sales      |  60000 |
| 102 | Manoj     | Mishra      | Sales      |  20000 |
| 103 | Ravi      | Yadav       | Marketing  |  40000 |
| 104 | Amisha    | Arora       | Marketing  |  44000 |
| 106 | Alok      | Tiwari      | Marketing  |  99443 |
| 109 | Ritesh    | Shrivastava | Sales      |  57000 |
| 110 | Suresh    | Awasthi     | Marketing  |  84000 |
| 111 | Kushagra  | Goel        | Marketing  |  75000 |
+-----+-----------+-------------+------------+--------+
8 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where department in ('marketing', 'sales');
RESULT: Shown records from sales and marketing department only.

OUTPUT:
+-----+-----------+-------------+------------+--------+
| eid | firstname | lastname    | department | salary |
+-----+-----------+-------------+------------+--------+
| 101 | Amit      | Singh       | Sales      |  60000 |
| 102 | Manoj     | Mishra      | Sales      |  20000 |
| 103 | Ravi      | Yadav       | Marketing  |  40000 |
| 104 | Amisha    | Arora       | Marketing  |  44000 |
| 106 | Alok      | Tiwari      | Marketing  |  99443 |
| 109 | Ritesh    | Shrivastava | Sales      |  57000 |
| 110 | Suresh    | Awasthi     | Marketing  |  84000 |
| 111 | Kushagra  | Goel        | Marketing  |  75000 |
+-----+-----------+-------------+------------+--------+
8 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where firstname like 'a%';
RESULT: Shown records those firstname starts from 'A'.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 101 | Amit      | Singh    | Sales      |  60000 |
| 104 | Amisha    | Arora    | Marketing  |  44000 |
| 106 | Alok      | Tiwari   | Marketing  |  99443 |
| 108 | Akash     | Saxena   | Training   |  39000 |
| 112 | Abha      | Rastogi  | Accounts   |  35000 |
+-----+-----------+----------+------------+--------+
5 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where firstname like '%A%';
RESULT: Shown records having 'A' anywhere in their firstname.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 101 | Amit      | Singh    | Sales      |  60000 |
| 102 | Manoj     | Mishra   | Sales      |  20000 |
| 103 | Ravi      | Yadav    | Marketing  |  40000 |
| 104 | Amisha    | Arora    | Marketing  |  44000 |
| 105 | Rakesh    | Kumar    | NULL       |   NULL |
| 106 | Alok      | Tiwari   | Marketing  |  99443 |
| 107 | Suman     | Singh    | Training   |  39000 |
| 108 | Akash     | Saxena   | Training   |  39000 |
| 111 | Kushagra  | Goel     | Marketing  |  75000 |
| 112 | Abha      | Rastogi  | Accounts   |  35000 |
+-----+-----------+----------+------------+--------+
10 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where firstname like '%A';
RESULT: Shown records those firstname ends with 'A'.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 104 | Amisha    | Arora    | Marketing  |  44000 |
| 111 | Kushagra  | Goel     | Marketing  |  75000 |
| 112 | Abha      | Rastogi  | Accounts   |  35000 |
+-----+-----------+----------+------------+--------+
3 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where lastname like '%A';
RESULT: Shown records those lastname ends with 'A'.

OUTPUT:
+-----+-----------+-------------+------------+--------+
| eid | firstname | lastname    | department | salary |
+-----+-----------+-------------+------------+--------+
| 102 | Manoj     | Mishra      | Sales      |  20000 |
| 104 | Amisha    | Arora       | Marketing  |  44000 |
| 108 | Akash     | Saxena      | Training   |  39000 |
| 109 | Ritesh    | Shrivastava | Sales      |  57000 |
+-----+-----------+-------------+------------+--------+
4 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where firstname like 'A___';
RESULT: Shown records having firstname starting with A with total firstname length of 4 characters.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 101 | Amit      | Singh    | Sales      |  60000 |
| 106 | Alok      | Tiwari   | Marketing  |  99443 |
| 112 | Abha      | Rastogi  | Accounts   |  35000 |
+-----+-----------+----------+------------+--------+
3 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select distinct department from empinfo;
RESULT: Shown all distinct departments of table records. If 'distinct' removed, department names will be repeated as per records.

OUTPUT:
+------------+
| department |
+------------+
| Sales      |
| Marketing  |
| NULL       |
| Training   |
| Accounts   |
+------------+
5 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select count(*) from empinfo;
RESULT: Shown total records.

OUTPUT:
+----------+
| count(*) |
+----------+
|       13 |
+----------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select count(eid) from empinfo;
RESULT: Shown total eid's.

OUTPUT:
+------------+
| count(eid) |
+------------+
|         13 |
+------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select count(department) from empinfo;
RESULT: Shown total departments, excluding Nulls.

OUTPUT:
+-------------------+
| count(department) |
+-------------------+
|                12 |
+-------------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select count(distinct department) from empinfo;
RESULT: Shown distinct departments.

OUTPUT:
+----------------------------+
| count(distinct department) |
+----------------------------+
|                          4 |
+----------------------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select sum(salary) from empinfo;
RESULT: Shown total sum of all the eids numbers.

OUTPUT:
+-------------+
| sum(salary) |
+-------------+
|      650443 |
+-------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select avg(salary) from empinfo;
RESULT: Shown average of all the eid numbers.


OUTPUT:
+-------------+
| avg(salary) |
+-------------+
|  54203.5833 |
+-------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select floor(avg(salary)) from empinfo;
RESULT: Shown an minimum-roundoff average of eid numbers.

OUTPUT:
+--------------------+
| floor(avg(salary)) |
+--------------------+
|              54203 |
+--------------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select ceiling(avg(salary)) from empinfo;
RESULT: Shown an maximum-roundoff average of eid numbers.

OUTPUT:
+----------------------+
| ceiling(avg(salary)) |
+----------------------+
|                54204 |
+----------------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select max(salary) from empinfo;
RESULT: Shown the maximum salary of the record.

OUTPUT:
+-------------+
| max(salary) |
+-------------+
|       99443 |
+-------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select min(salary) from empinfo;
RESULT: Shown the minimum salary of the record.

OUTPUT:
+-------------+
| min(salary) |
+-------------+
|       20000 |
+-------------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select sum(firstname) from empinfo;
RESULT: If used arithmetic operations with string values, it will result in zero.

OUTPUT:
+----------------+
| sum(firstname) |
+----------------+
|              0 |
+----------------+
1 row in set, 13 warnings (0.00 sec)
```

<hr>

```
COMMAND: select * from empinfo where salary=(select max(salary) from empinfo);
RESULT: Shown the heighest salary record. If two same heightest salaries, two records would have been shown.

OUTPUT:
+-----+-----------+----------+------------+--------+
| eid | firstname | lastname | department | salary |
+-----+-----------+----------+------------+--------+
| 106 | Alok      | Tiwari   | Marketing  |  99443 |
+-----+-----------+----------+------------+--------+
1 row in set (0.00 sec)
```

<hr>

```
COMMAND: select department, count(eid) from empinfo group by department;
RESULT: Shown total countings of different departments.

OUTPUT:
+------------+------------+
| department | count(eid) |
+------------+------------+
| Sales      |          3 |
| Marketing  |          5 |
| NULL       |          1 |
| Training   |          2 |
| Accounts   |          2 |
+------------+------------+
5 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select department, count(eid) as '#employee' from empinfo group by department;
RESULT: Shown total countings of different departments and column header-name changed.

OUTPUT:
+------------+-----------+
| department | #employee |
+------------+-----------+
| Sales      |         3 |
| Marketing  |         5 |
| NULL       |         1 |
| Training   |         2 |
| Accounts   |         2 |
+------------+-----------+
5 rows in set (0.00 sec)
```

<hr>

```
COMMAND: select department, count(eid) as '#employee' from empinfo group by department having count(eid) >= 3;
RESULT: Shown total countings of departments having counting greater than 3 and column header-name changed.

OUTPUT:
+------------+-----------+
| department | #employee |
+------------+-----------+
| Sales      |         3 |
| Marketing  |         5 |
+------------+-----------+
2 rows in set (0.00 sec)
```
