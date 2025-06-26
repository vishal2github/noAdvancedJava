# **SPRING-BOOT FRAMEWORK**

<br>

### **Spring boot**

+ Spring boot framework is known as an extention of Spring framework.

+ It has all the features of spring framework.

+ Developing applications using **Spring boot framework** is much easier than developing applications using spring framework.

+ It has several useful and newer features:
  
  + Auto configuration
  
  + Starter dependencies
  
  + Embedded web server
  
  + Spring boot CLI
  
  + Spring actuator
  
  + Spring initializer
  
  + etc...

+ By using spring boot, web applications, web services as well as, micro-services can easily be build.

+ Every application of spring boot is a **standalone application**.

+ In every application there will be a main class by default, which is annotated with **@SpringBootApplication** annotation.

  + This main class will be responsible to start/launch/boot the application.

<br>

### **Spring data-JPA**

+ It is a spring library.

+ It adds an extra layer of abstraction on JPA provider such as:
  
  + Hibernate
  
  + EclipseLink
  
  + IBatis
  
  + etc...

+ It provides several interfaces, one of them is **JpaRepository**.

+ A child interface of "JpaRepository" interface is needed to be created.

<br>

```
  CHILD INTERFACE

    public interface MyRepository extends JpaRepository<EntityClass, WrapperClassOfPrimaryKey>
    {
    }
```

<br>

+ Implementation of this child interface will be provided by spring framework.

+ It doesn't have the **cache feature**.
