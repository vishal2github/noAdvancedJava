# JAVA FRAMEWORK: HIBERNATE, JPA, AND ORM

<br>

### **ORM**

+ "ORM" is a framework tool.
+ It stands for "Object Relational Mapping".

+ ORM tool will perform followig tasks:
  + Persisting objects (Inserting data of object into table as a record)
  + Deleting objects (Deleting records from the table)
  + Updating objects (Updating records)
  + Returning objects (Selecting record/records)
  + etc...

+ ORM tool will call JDBC API to perform above task.

+ "Hibernate" framework is one of the most widely used ORM tool.

<br>

### **Persisting object**

+ Saving states of the object permanently is called "persisting object".
+ As known, states of the object is kept temporarily into memory by program.

<br>

### **Build tool**

+ It's a software that automates the process of turning the code into a working program or application.
+ It helps prepare, compile, and package the code so that it can run on a computer or server.
+ Build tools save time and make sure the process is consistent every time there's need to build a project.
+ It also helps in unit testing code.

+ Examples of build tool:
  + **Maven** (for Java)
  + **Gradle** (for Java, Kotlin, etc.)
  + **Webpack** (for JavaScript/TypeScript)
  + **Make** (for C/C++)

<br>

### **Maven**

+ It is a build tool.

+ It performs several steps/tasks during application development:
  + Creating directory sturcture of the project
  + Managing project dependencies (external 'jar' files)
  + Compiling source code of the project/application
  + Creating partial unit testing code
  + Creating deployable file
  + Deploying project
  + etc...

<br>

### **Hibernate**

+ Hibernate is a widely used ORM tool.

+ Hibernate performs/handles several JDBC responsibilities:
  + Loaing driver class
  + Creating connection
  + Creating statement object
  + Writing SQL queries
  + Executing SQL queries
  + Creating ResultSet object
  + Storing records in result set
  + To put/retrieve the recoreds in the class object
  + etc...

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

  + All external jar files (that project need in order to perform jar file) are known as dependencies.
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
    
  ```
    POJO/PERSISTENT/ENTITY CLASS SYNTAX

      public class Product
      {
        // declare instance variables
        // define getters and setters
      }
  ```

  <br>

  #### **4. Creating hbm file**

  + "HBM" stands for "Hibernate Mapping".
  + It's an XML file.
  + In this file, we'll have to write mapping of persistent class with table.
  + So that hibernate can perform SQL operations (such as, creating table, inserting records, deleting records, etc).
  
  + We will use following tags provided by hibernate framework:
    + hibernate-mapping
    + class
    + id
    + property
    + etc...
  
  + This file is to be created inside "src" folder, which "xml" as an extension name.

  + Values for "hbm2ddl.auto" properties:
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

+ Our program (respository class) will call methods of above interfaces to communicate with hibernate.

<br>

  #### **SessionFactory interface**

  + Our repository class (program) will create an object of this interface.
  + DDL operation will be performed as soon as object of this interface will be created.
  + Repository class can call buildSessionFactory() method of Configuation class to create this object.
  + Before calling buildSessionFactory() method call configure() method of Configuration class to load cfg file in memory.

    + **Note:** If cfg file name is "hibernate.cgf.xml", then it isn't necessary to pass this file name inside "configure()" method. It is only passed if the file name is different.

  <br>

  ```
    SYNTAX

      Configuration c = new Configuration();
      c.configure("hibernate.cfg.xml");
      SessionFactory factory = c.buildSessionFactory();

    OR VIA METHOD CHAINING

      SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
  ```

  #### **Session interface**

  + Our repository class will call methods of this interface to perform DML (Persisting object, deleting object, updating object), and DQL (Select object) operation.
  + Call openSession() method of SessionFactory interface to create object of Session interface.
  
  <br>

  ```
    SYNTAX

      Session session = factory.openSession();
  ```

  <br>

  #### **Transaction interface**

  + Our repository class will call methods of this interface to begin and commit transaction.
  + Our repository class will call begin() and commit() methods of this interface.
  + Every DML operation must be inside begin and commit transactions.

  <br>

  ```
    SYNTAX

      Transaction tr = session.getTransaction();
      tr.begin();
      session.persist();
      session.save();
      tr.commit();
  ```
<br>

### **HQL**

+ "HQL" stands for "Hibernate Query Language".
+ As for hibernate, it hasn't methods for every query possible, hence, one needs to write custom query and give that query to the hibernate. This query is called HQL.
+ One can write and use this query for select, delete, and update tasks.
+ In this query, one has to write "Persistent" class name in place of table name.
+ One has to write instance variable name in place of column name.
+ One has to pass this query to the createQuery() method of Session interface.
+ The createQurery() method will create an object of "org.hinbernate.query.Query" interface and store the passed query into this object and return reference of this object.

<br>

```
  SYNTAX

    Query<Employee> query = session.createQuery("from Employee", Employee.class);
    List<Employee> employeeList = query.list();
```

<br>

### **Class-relations in hibernate**

+ In hibernate, one need to map the relationships of "Inheritance" and/or "Association".

+ One has following two types of mapping between entities (persistent classes) here:
  + Inheritance
  + Association

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
        (IS A RELATIONSHIP FACTOR).
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
        (HAS A RELATIONSHIP FACTOR)
```

<br>

### **Association**

+ This mapping is required when object of one entity class will be used by other entity classes.

+ There are four types of association between objects/instances:
  + One-to-one (Identity-Person)
  + One-to-many (User-SIMS)
  + Many-to-one (SIMS-User)
  + Many-to-many (Teachers-Students, Students-Courses)

<br>

### **States of object in hibernate**

+ Transient state
+ Persistent state
+ Detatched state
+ Removed state
