# **DRIVER CLASS**

<br>

### **Driver class**

+ Driver class is generally associated with JDBC.

+ It refers to an interface or class responsible for managing the connection between Java applications and a database.

+ It acts as a mediator that translates Java code into database-specific commands.

+ Driver is typically a specific implementation of the **java.sql.Driver** interface, that helps Java programs to interact with databases.

+ **JDBC Driver:** It is a set of classes that implement the **java.sql.Driver** interface and provide the implementation of establishing a connection to a specific database.

<br>

### **Purpose of the Driver**

+ The primary function of a driver is to translate Java application calls into database-specific calls.

+ It ensures communication between Java code and the database _(like MySQL, Oracle, etc.)_.

+ The driver handles the details of how to establish a connection with the database, execute SQL commands, and return results.

+ By using a driver, Java ensures seamless and standardized interaction with different DBMS's.

<br>

### **Types of JDBC drivers**

+ **Type-1 Driver _(JDBC-ODBC Bridge)_**

  + Uses ODBC _(Open Database Connectivity)_ to connect to the database.

  + The ODBC driver is installed on the machine, and JDBC-ODBC bridge translates Java calls into ODBC calls.

  + **Example:** **_sun.jdbc.odbc.JdbcOdbcDriver_** (this driver is deprecated and not recommended for modern Java applications).

  + **Use case:** It was used when Java didn't have native support for certain databases, but it is now outdated and mostly obsolete.

<br>

+ **Type-2 Driver _(Native-API driver)_**

  + Uses database-specific native libraries to connect.

  + The driver communicates with the databse using the database's native client API.
  
  + So each database requires a different driver implementation.

  + **Example:** Oracle's **_oracle.jdbc.driver.OracleDriver_**.

  + **Use case:** Works well for databases with available native liberaries, but can be platform-dependent and requires native components.

<br>

+ **Type-3 Driver _(Network Protocol driver)_**

  + Uses a middle-tier server to communicate with the database.

  + This driver communicates with a middleware server _(like a database proxy)_ that translates the database-specific protocol into a standard network protocol.

  + **Example:** **org.postgresql.Driver** for PostgreSQL, or any other driver that uses middleware.

  + **Use case:** This driver is used in client-server architectures, especially when database access is centralized through a server.

<br>

+ **Type-4 Driver _(Thin driver)_**

  + The driver directly communicates with the database using the database's native protocol.

  + It is written purely in Java.

  + **Example:** **com.mysql.cj.jdbc.Driver** for MySQL.

  + **Use case:** Most commonly used type of driver in modern Java applications, because it's platform-independent and doesn't require external libraries or middleware.

<br>

### **Working of Driver class (Role of DriverManager)**

+ In JDBC setup, the **DriverManager** class is responsible for managing the drivers registered in application.

+ It's main role is to maintain a list of available database drivers and provide a mechanism for establishing a dababase connection.

+ When an application needs to interact with a database, the appropriate driver class are loaded using the **DriverManager.getConnection()** method, which makes use of the driver to establish the connection.

  + **Driver Registration:** When application loads a JDBC driver *(using Class.forName("driver_class"))*, the driver registers itself with DriverManager automatically.

  + **Connection Request:** When a connection is requested *(via DriverManager.getConnection())*, DriverManager checks its list of registered drivers, tries to find a driver that can establish a connection to the provided database URL.

  + **Choosing right Driver:** If there are multiple drivers available, DriverManager picks the first suitable driver it finds for the given URL (database protocol and address).

<br>

  #### **Example steps of using Driver in JDBC**

  <br>

  + **Loading the Driver (Driver registration)**
    
    + To connect to a database, first, you need to load the JDBC driver class using **class.forName().**

    + This step makes the driver available to the DriverManager.

    <br>

    ```
      DRIVER CLASS LOADING SYNTAX

        Class.forName("com.mysql.cj.jdbc.Driver");

        (Here, the driver for MYSQL is loaded)
    ```

    + In modern JDBC versions, driver registration usually happens automatically via Class.forName().

    + **Automatic Registration:** From JDBC 4.0 (Java 4 and above), if correct driver JAR is used in classpath, it automatically registers itself with DriverManager, without needing explicit loading via Class.forName().

  <br>

  + **Establishing a connection (via database URL)**
      
    + Once the driver is loaded, the **DriverManager.getConnection()** method to establish a connection to the database via database URL.

    + It specifies the location and the type of database.

    <br>

    ```
      JDBC URL FORMAT

        jdbc:subprotocol://hostname:port/databaseName
    
      
      JDBC URL for MySQL

        jdbc:mysql://localhost:3306/myDatabse;


      JDBC URL for Oracle

        jdbc:oracle:thin:@localhost:1521:xe;
    ```
    
    <br>

    + It's a string that includes:
      
      + **jdbc:** _(This prefix tells the DriverManager that you're using JDBC)_
      
      + **subprotocol** _(The protocol that corresponds to a specific database, e.g., MySQL, Oracle, Postgresql)_
      
      + **hostname** _(The server address where the database is hosted, e.g., localhost, or an IP address)_
      
      + **port** _(The port number the database listens on, e.g., 3306 for MySQL)_

      + **databaseName** _(The specific database one wants to connect to)_

    <br>

    ```
      CONNECTION OBJECT SYNTAX

        Connection cn = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/mydb", "username", "pass");
    ```

    + In real-world application, directly creating new Connection objects using DriverManager can be in-efficient.

    + Connection pooling libraries like **HiariCP** or **Apache DBCP** are often used to manage connections more efficiently.

  <br>

  + **Using the connection**

    + After obtaining the connection, it is used to create a **Statement** or **PreparedStatement** to execute SQL queries.

    <br>

    ```
      STATEMENT AND PREPARED-STATEMENT SYNTAXES

        Statement st = cn.createStatement();

        ResultSet rst = st.executeQuery("SELECT * FROM tableName");
    ```

  <br>

  + **Closing the connection**

    + Finally, it is essential to close the **Connection, Statement, and ResultSet** objects to release database resources.

    <br>

    ```
      CLOSING SYNTAXES

        resultSet.close();
        statement.close();
        connection.close();
    ```

<br>

### **Importance of Driver class**

+ **Abstraction**

  + It abstracts away the database-specific details, so one can switch databases without changing the Java application logic.

+ **Database connectivity**

  + Without the driver, Java wouldn't know how to connect to different databases (like MySQL, Oracle, etc.), since each database uses a unique protocol.

+ **Flexibility**

  + The driver class allows Java programs to communicate with a wide range of databases using the same JDBC interface.
