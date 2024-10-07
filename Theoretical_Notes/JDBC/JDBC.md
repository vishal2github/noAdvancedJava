# JDBC (JAVA DATABASE CONNECTIVITY)

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

### JDBC steps

+ Loading driver class
+ Creating connection object
+ Creating statement object
+ Executing SQL queries
+ Closing connection

<br>

### Driver class

+ It is implementation of 'java.sql.Driver' interface.

+ Driver interface has several methods, one of them is like:

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

+ **Remember:** Every driver class has a special feature which is as follows:
  + "Every driver class creates an object of itself and gives reference of that object to the 'DriverManger' class on loading."

