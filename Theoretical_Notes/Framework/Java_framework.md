# JAVA FRAMWORK

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

### **Hibernate usage steps in java project**

+ Several steps are:
  + Create maven project
  + Configure project dependencies into "pom.xml" file
  + Create presistent class
  + Create hbm file
  + Create CFG file
  + Create repository class

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

+ It performs several tasks during application development:
  + Creating directory sturcture of the project
  + Managing project dependencies (external 'jar' files)
  + Compiling source code of the project/application
  + Creating partial unit testing code
  + Creating deployable file
  + Deploying project
  + etc...
