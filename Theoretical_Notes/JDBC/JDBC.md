# **JDBC (JAVA DATABASE CONNECTIVITY)**

<br>

### **JDBC**

+ The connection established from java language to the database servers is known as 'java-database connectivity'.

+ JDBC is an API **(Application Programming Interface)** used for such connection establishments.

+ The java project calls this API to connect database server (such as MySql, Oracle, MS-Sql, etc), and to execute SQL queries.

+ API's are nothing but the methods which will be called by the program.

+ Method's declaration/signature is defined by java vendors.

+ Method's implementation is provided by database server-vendors (like, MySql vendor, Oracle vendor, etc).

+ Several interfaces (kept in java.sql package) have signature of these methods. Few such interfaces are:
  + Driver interface
  + Connection interface
  + Statement interface
  + PreparedStatement interface
  + CallableStatement interface
  + ResultSet interface
  + etc...

<br>

### **JDBC steps**

+ Loading driver class
+ Creating connection object
+ Creating statement object
+ Executing SQL queries
+ Closing connection

<br>

### **Driver class**

+ It is implementation of 'java.sql.Driver' interface.

+ Driver interface has several methods, one of them is like:

  <br>

  ```
    public Connection connect(String url, Properties p)
  
    Note:
      > Implementation of this method is given inside driver class.
      > Program will call this method to make connection with database server and to create connection object.
      > Code to call this method is pre-defined.

      > This code is written inside following method of 'java.sql.DriverManager class:
        >> public static Connection getConnection(String url, String username, String password)
        >> DriverManager.getConnection("http://localhost:3306/jdbc10", "root", "mysql")
        >> As we known, getConnection method will call connect method of driver class, so it must have reference of object of respected driver class.
  ```

<br>

+ **Remember:** Every driver class has a special feature which is as follows:
  + "Every driver class creates an object of itself and gives reference of that object to the 'DriverManger' class on loading."

<br>

### **Creating statement object**

+ In order to execute SQL queries, program will call methods of the following interfaces:
  + Statement interface
  + PreparedStatement interface
  + etc...

+ Object of these interfaces is called statement object.

<br>

### **Statement interface**

+ Program will call methods of this interface to execute 'static' SQL queries (non-parameterized queries), i.e., the queries that don't require the user input.

+ Few methods under 'statement interface' are:
  + public boolean execute(String query) **_(Call to execute SQL DDL query)_**
  
  + public int executeUpdate(String query) **_(Call to execute SQL DML non-parameterized query)_**
  
  + public ResultSet executeQuery(String query) **_(Call to execute SQL DQL non-parameterized query)_**
  
  + etc...

<br>

```
  STATEMENT INTERFACE SYNTAX:
  
    Statement st = cn.createStatement();
```

<br>

### **PreparedStatement interface**

+ Program will call methods of this interface to execute 'dynamic' SQL queries (non-parameterized queries), i.e., the queries that don't require the user input.

+ Few methods under 'statement interface' are:
  + public int executeUpdate() **_(Call to execute SQL DML parameterized query)_**
  
  + public ResultSet executeQuery() **_(Call to execute SQL DQL parameterized query)_**
  
  + etc...

<br>

```
  PREPARED-STATEMENT INTERFACE SYNTAX:
  
    PreparedStatement ps = cn.preparedStatement("Write SQL query here!");
```

<br>

### **Executing SQL select query**

+ If query is 'static', then following method of 'statement interface' is called to execute this query:

<br>

```
  public ResultSet executeQuery(String query)
```

<br>

+ If query is 'dynamic', then following method of 'PreparedStatement interface' is called to execute this query:

<br>

```
  public ResultSet executeQuery();
```

<br>

### **ResultSet interface**

+ An object of this interface is created and returned by executionQuery() method of 'Statement' and 'PreparedStatement' interfaces.

+ In this object, executeQuery() method keeps result-set data (i.e., records given by database server).

+ The program will fetch data from this object and show to the user.

+ **ResultSet object**
  + Object of this interface is called 'resultset object'.
  
  + Every resultset object maintains a cursor which is initially positioned just before the first record (at index -1).
  
  + The program can call next() method of ResultSet interface to move cursor one position forward. Return type of next() method is 'boolean'.
