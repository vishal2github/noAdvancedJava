# JAVA FRAMEWORK

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

  <br>

  #### **5. Creating CFG file**

  <br>

  #### **6. Creating repository class**

<br>
