# **HIBERNATE**

<br>

### **ORM**

+ "ORM" is a framework tool.

+ It stands for **Object Relational Mapping.**

+ ORM tool will perform followig tasks:

  + Persisting objects (Inserting data of object into table as a record)
  
  + Deleting objects (Deleting record/records from the table)
  
  + Updating objects (Updating record/records)
  
  + Returning objects (Selecting record/records)
  
  + etc...

+ ORM tool will call JDBC-API to perform above tasks.

+ **Hibernate** framework is one of the most widely used ORM tool.

<br>

### **Persisting object**

+ Saving states of the object permanently is called **persisting object.**

+ As known, states of the object is kept temporarily into memory by program.

<br>

```
  OBJECT'S ATTRIBUTE AND STATE EXAMPLE

    public class Employee
    {
      private int eid;
      private String name;
    }

    • In case of class, eid and name will be instance variables.

    • With object's analogy, eid and name will be object's attributes,
      and their values will be object's state.
```

<br>

### **Build tool**

+ Build tools or programs help create an executable application from the source code.

+ It's a software that automates the process of turning the code into a working program or application.

+ It helps prepare, compile, and package the code so that it can run on a computer or server.

+ Build tools save time and make sure the process is consistent every time there's need to build a project.

+ It also helps in unit testing code.

+ The build tool is needed for the following processes:

  + Generating source code

  + Generating documentation from the source code

  + Compiling source code

  + Packaging the compiled codes into JAR files

  + Installing the packaged code in the local repository, server, or central repository.

+ Examples of build tool:
  
  + **Maven** (for Java)
  
  + **Gradle** (for Java, Kotlin, etc.)
  
  + **Webpack** (for JavaScript/TypeScript)
  
  + **Make** (for C/C++)

<br>

### **Maven**

+ An open-source build tool developed by **Apache group.**

+ It is written in Java.

+ Based on **Project Object Model,** this tool has made java project's development easier, while developing reports, checks build, and testing automation setups.

+ Maven is chiefly used for Java-based projects, helping to download dependencies, which refers to the libraries or JAR files.

+ It performs several steps/tasks during application development:
  
  + Creating directory sturcture of the project
  
  + Managing project dependencies _(external JAR files)_
  
  + Compiling source code of the project/application
  
  + Creating partial unit testing code
  
  + Creating deployable file
  
  + Deploying project
  
  + etc...

<br>

### **Pros of Maven**

+ Helps manage all the processes like building, documentation, and distribution in project management.

+ Simplifies project building process.

+ Increases performance of project and the building process.

+ Task of downloading JAR files and other dependencies is done automatically.

+ Easy to add new dependencies by writing the dependency code in POM file.

<br>

### **Cons of Maven**

+ Maven requires installation in working system and the Maven plug-in for the IDE.

+ If Maven code for an existing dependency is unavailable, one can't add that dependency using Maven itself.

<br>

### **Hibernate**

+ Hibernate is a widely used ORM tool.

+ Hibernate performs/handles several JDBC responsibilities:
  + Loading driver class
  + Creating connection
  + Creating statement object
  + Writing SQL queries
  + Executing SQL queries
  + Creating ResultSet object
  + Storing records in result set
  + To put/retrieve the recoreds in the class object
  + etc...

+ Hence, conclusion, hibernate helps the program to perform database related operations, like:
 
   + Creating table
 
   + Record insertion in table

   + Record deletion

   + Record updation

   + Record selection


<br>

### **Hibernate usage steps in java project**

+ Several steps are:
  + Create maven project
  + Configure project dependencies into "pom.xml" file
  + Create presistent class
  + Create hbm file
  + Create CFG file
  + Create repository class

<br>

  #### **1. Creating Maven project**

  + File → New → Maven project option

  + New Maven project window → Click next

  + Select an Archetype → Catalog → Internal

  + Archetype list log → Select archetype (either "maven-archetype-quickstart" or "maven-archetype-webapp")
    + **Note:** Can select "maven-archetype-quickstart for standalone.
    + After archetype selection → Click next

  + Enter group id (Org name), artifact id (project name), and package name
    + Group Id: com.cetpa
    + Artiface Id: hibernate-demo
    + Package: com.cetpa

  + At last, Click on finish

  + Right click project name → build path → libraries → liberary → select java 1.8

  <br>

  #### **2. Configuring project dependencies into pom.xml file**

  + All external jar files (that project need in order to perform jar file) are known as **dependencies.**

  + Can add these jar files manually in the project.

  + Or we can configure these dependencies for Maven, in case, Maven will download and add these jar files into project.

  + Maven will download all jar files from central repository and copies all jar files into local repository (Local repository is created into computer in which project is built).

  + How to configure project dependencies?
    + Every Maven project has an xml file, named "pom.xml".
    + "Pom" stands for "Project Object Model".
    + In this xml file, we'll have to write our requirement (such as external jar files), by using tags given by Maven.

  <br>

  #### **3. Creating persistent class**

  + Instances of this class will be saved/persisted by ORM tool (i.e., Hibernate) into database.

  + This class is also known as entity class.

  + This class should be java "POJO" class.

  + "POJO" stands for "Plain Old Java Object".

  + A POJO class must have:
    + Private instance variables
    + No argument constructor (non-parameterized or default constructor)
    + Contains "getters" and "setters"
    
  <br>

  ```
    POJO/PERSISTENT/ENTITY CLASS SYNTAX

      public class Product
      {
        // Declare instance variables
        // Default constructor
        // Define getters and setters
      }
  ```

  <br>

  #### **4. Creating hbm file**

  + **HBM** stands for **Hibernate Mapping.**

  + It's an XML file.

  + In this file, we'll have to write mapping of persistent class with table.

  + So that hibernate can perform SQL operations **(such as, creating table, inserting records, deleting records, etc).**
  
  + We will use following tags provided by hibernate framework:
    + hibernate-mapping
    + class
    + id
    + property
    + etc...
  
  + This file is to be created inside **src** folder, with **xml** as an extension name.

  + Values for **hbm2ddl.auto** properties:

    + **update** _(If table doesn't exist, then SessionFactory will create table according to the mapping information)_
    
    + **create** _(If table doesn't exist, then SessionFactory will create table according to the mapping information. If table exists, then SessionFactory will drop that table and create table again)_
    
    + **create-drop** _(If table doesn't exist, then SessionFactory will create table according to the mapping information. If table exists, then SessionFactory will drop that table and create table again. When SessionFactory will be closed by program then that table will be dropped by SessionFactory)_
    
    + **validate** _(In this case, SessionFactory will check existence of table in database. If not found, then throw and exception)_

  <br>

  #### **5. Creating CFG file**

  + It stands for configuration.

  + It should be an "xml" file.

  + This file keeps database connection information and many more.

  + **Note:** If file name is "hibernate.cgf.xml", then it isn't necessary to pass this file name inside "configure()" method. It is only passed if the file name is different.

  <br>

  #### **6. Creating repository class**

<br>

### **Interfaces of Hibernate**

+ There are several interfaces provided by hibernate like:
  
  + SessionFactory interface
  
  + Session interface
  
  + Transaction interface
  
  + Query interface
  
  + etc...

+ The program _(respository class)_ will call methods of above interfaces to communicate with hibernate.

<br>

  #### **SessionFactory interface**

  + The repository class _(program)_ will create an object of this interface.

  + **DDL operation** will be performed as soon as object of this interface will be created.

  + Repository class can call **buildSessionFactory()** method of Configuation class to create this object.

  + Before calling buildSessionFactory() method, call **configure()** method of Configuration class to load CFG file in memory.

  + **Note:** If CFG file name is **hibernate.cgf.xml**, then it isn't necessary to pass this file name inside **configure()** method. It is only passed if the file name is different.

  <br>

  ```
    SESSIONFACTORY INTERFACE SYNTAX

      Configuration c = new Configuration();
      c.configure("hibernate.cfg.xml");
      SessionFactory factory = c.buildSessionFactory();


    OR VIA METHOD CHAINING

      SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
  ```

  <br>

  #### **Session interface**

  + The repository class _(program)_ will call methods of this interface to perform DML _(Persisting object, deleting object, updating object)_, and DQL _(Select object)_ operations.

  + Call **openSession()** method of SessionFactory interface to create object of Session interface.
  
  <br>

  ```
    SESSION INTERFACE SYNTAX

      Session session = factory.openSession();
  ```

  <br>

  #### **Transaction interface**

  + The repository class will call methods of this interface to begin and commit transaction.

  + The repository class will call **begin()** and **commit()** methods of this interface.

  + Every DML operation must be inside begin and commit transactions.

  <br>

  ```
    TRANSACTION INTERFACE SYNTAX

      Transaction tr = session.getTransaction();
      tr.begin();
      session.persist();
      session.save();
      tr.commit();
  ```

  <br>

  ```
    NOTE: persist() vs save() 

      • persist() has return-type "void".
      • save() has return-type "serializable".
  ```

<br>

### **Transaction in SQL**

+ In SQL, **transaction** refers to a sequence of one or more SQL operations that are executed as a single unit of work.

+ For data consistency and integrity, it ensures that all changes made to the database within the transaction are:

  + **Either fully completed** _(commited)_

  + **Or, fully undone** _(rolled back)_

+ Transaction typically involves operations like **insert, update, delete, or select.**

+ Transaction follows the **ACID** properties:

  + **Atomicity**

    + Ensures a transaction is treated as a single "atomic" unit.

    + Either all operations in transaction are executed, or none of them are (in failure condition).

    + If a part of transaction fails, the entire transaction is rolled back.

  + **Consistency**

    + Database must transition from one consistent state to another after the transaction.

    + Ensures database rules (constraints, triggers, etc.) aren't violated.

  + **Isolation**

    + Transactions are isolated from each other.

    + Intermediate results of transaction aren't visible to other transactions until the transaction is committed.

    + Ensures transactions don't interfere with each other and assures data consistency.

  + **Durability**

    + Once transaction is committed, it's effects are permanent, even if there's a system crash.

    + Changes made by transaction are saved to database.

+ There are majorily three transaction control statements:

  + **Begin:** Marks beginning of a transaction.

  + **Commit:** Saves the changes made during the transaction to database.

  + **Rollback:** Reverts any changes made during the transaction if an error occurs or if the transaction is explicitly canceled.

<br>

### **HQL**

+ **HQL** stands for **Hibernate Query Language.**

+ As for hibernate, it hasn't methods for every query possible, hence, one needs to write custom query and give that query to the hibernate. This query is called HQL.

+ One can write and use this query for select, delete, and update tasks.

+ In this query, one has to write **Persistent** class name in place of table name.

+ One has to write instance variable name in place of column name.

+ One has to pass this query to the **createQuery()** method of Session interface.

+ The createQurery() method will create an object of **org.hibernate.query.Query** interface and store the passed query into this object and return reference of this object.

<br>

```
  QUERY INTERFACE SYNTAX

    Query<Employee> query = session.createQuery("from Employee", Employee.class);
    List<Employee> employeeList = query.list();
```

<br>

### **Class-relations in hibernate**

+ In hibernate, one need to map the relationships of "Inheritance" and/or "Association".

+ Two types of mapping between entities (persistent classes) are:
  
  + **Inheritance**
  
  + **Association**

<br>

```
  INHERITANCE (EXTENDS)

    public class AA
    {
      // properties
    }

    public class BB extends AA
    {
      // code
    }

  Note: Here, class "BB" is a sub-class of class "AA".
        ("IS A" RELATIONSHIP FACTOR).
```

<br>

```
  ASSOCIATION

    public class BB
    {
      private AA obj;
      
      public BB(AA obj)
      {
        this.obj = obj;
      }
    }
  
  Note: Here, object of class "BB" has an object of class "AA".
        ("HAS A" RELATIONSHIP FACTOR)
```

<br>

### **Association**

+ This mapping is required when object of one entity class will be used by other entity classes.

+ There are four types of association between objects/instances:
  
  + **One-to-one** _(Identity-Person)_
  
  + **One-to-many** _(User-SIMS)_
  
  + **Many-to-one** _(SIMS-User)_
  
  + **Many-to-many** _(Teachers-Students, Students-Courses)_

<br>

### **States of object in hibernate**

  #### Transient state

  + Transient state of an entity is when it is instantiated using the **new** keyword, but isn't yet associated with Hibernate session or database.

  + The object isn't yet tracked by Hibernate, and it doesn't have corresponding record in database.

  + Entity in this state is just plain Java object and doesn't have an identity that is recognized by Hibernate.

  <br>

  ```
    TRANSIENT STATE EXAMPLE

      Employee emp = new Employee();
      emp.setName("Alex Cooper");
  ```

  <br>

  #### Persistent state

  + Entity enters persistent state when associated with a Hibernate session and mapped to a record in database.

  + Any changes made to entity in this state are automatically synchronized with the database when the session is flushed _(e.g., when transaction is committed)_.

  + The object has an identifier that matches a record in the database.

  + Hibernate tracks the changes made to the object in this state.

  <br>

   ```
    PERSISTENT STATE EXAMPLE

      Session session = sessionFactory.openSession();
      session.beginTransaction();
      session.save(emp); // Now the entity is persistent
      session.getTransaction().commit();
      session.close();
  ```

  <br>

  #### Detatched state

  + Entity becomes detached when the Hibernate session that was managing it is closed or the entity is evicted from the session cache.

  + Object is no longer associated with session, but still has a representation of its identity _(e.g., primary key)_ and can be reattached to new session.

  + The changes made to the object in detached state aren't automatically synchronized with database unless entity is reattached to a session.

  <br>

  ```
    DETATCHED STATE EXAMPLE

      session.close();
      
      // The session is closed.
      // Entity becomes detached.
  ```

  <br>
  
  #### Removed state

  + Entity is in removed state when it is marked for deletion, usually using **session.delete()**.

  + Object is still in persistent state until session is flushed, at which point it is removed from database.

  + After deletion, entity is no longer tracked by Hibernate.

  <br>

  ```
    REMOVED STATE EXAMPLE

      session.delete(emp);

      // Entity is marked for deletion
  ```
