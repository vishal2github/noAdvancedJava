# SPRING FRAMEWORK

<br>

### **Introduction**

+ Spring framework is used to build enterprise level applications.

+ It's a lightweight framework.

+ It has several modules. Like:
  + Spring core
  + Spring context
  + Spring web
  + Spring AOP (Aspect Oriented Programming)
  + Spring ORM (Object Relational Mapping)
  + Spring OXM (Object XML Mapping)
  + Spring JDBC
  + Spring JMS (Java Messaging Service)
  + Spring test
  + etc...

+ One need to configure dependency of the module(s) in POM.xml file.
  + groupId
  + artifactId
  + version

<br>

### **Maven and gradle configuration files**

+ **Using Maven**
  + File used "pom.xml"
  + Data kept in xml format
  + Tag and attributes

```
  XML FORMAT

    <?xml version="1.0">
    <productinfo>
      <product>
        <pid>101</pid>
        <name>Mouse</name>
        <brand>Logitech</brand>
        <price>1500</price>
      </product>
    
      <product>
        <pid>102</pid>
          <name>Printer</name>
          <brand>HP</brand>
          <price>6000</price>
      </product>
    </productinfo>
```

<br>

+ **Using Gradle**
  + File used "build.gradle"
  + Data kept in json format
  + Key-value pair

```
  XML FORMAT

    [
        {
            "pid":101,
            "name":"Mouse",
            "brand":"Logitech",
            "price":1500
        },

        {
            "pid":102,
            "name":"Printer",
            "brand":"HP",
            "price":6000
        }
    ]
```

<br>

### **IOC**

+ It stands for "Inversion of Control".

+ Spring framework is based on IOC principle.

<br>

### **Object dependencies**

+ There could be a "tight coupling" as well as "loose coupling" between object dependencies.

+ **Scenario example:** If methods of class "AA" will be called by methods of class "BB", then one can say obejct of class "AA" will be dependency of object of class "BB".

<br>

### **Spring beans**

+ Objects created by spring framework for our program are known as spring beans.

+ Life cycle of these beans will be managed by spring framework:
  + Creating beans
  + Keeping reference of the beans
  + Initializing beans
  + Setting scope of the beans
  + Injecting beans (dependency injection)
  + etc...

+ IOC container performs above tasks for the program.

+ Program will provide configuration to the IOC container either using xml or annotation or java code.

<br>

### **IOC container**

+ As, life cycle of spring beans are managed by IOC container.

+ Spring framework provices following two IOC container:
  + BeanFactory container
  + ApplicationContext container

<br>

### **BeanFactory container**

+ BeanFactory is an interface.

+ It has several implementations. One of them is "XmlBeanFactory" class.

+ Our program can create an object from XmlBeanFactory class and use this object as BeanFactory container.

<br>

```
  SYNTAX

    Resource resource = new ClassPathResource("bean.xml");
    
    BeanFactory beanFactory = new XmlBeanFactory(resource);
```

<br>

### **ApplicationContext container**

+ ApplicationContext is an interface and a child of XmlBeanFactory interface.

+ It has several implementations. One of them is "ClassPathXmlApplicationContext" class.

+ Program can create an object from ClassPathXmlApplicationContext class, and use this object as ApplicationContext container.

+ It is recommended to use ApplicationContext container rather than BeanFactory.

<br>

```
  SYNTAX

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
```

<br>

### **XSD file**

+ "xsd" stands for 'XML Schema Document".

+ This file contains XML tags.

<br>

### **Dependency injection**

+ If method of class "BB" wants to invoke/call/run methods of class "AA", then object of class "AA" would be dependency of object of class "BB".

+ Since these objects will be created by IOC container, so, this would be responsibility of IOC container to give object of class "AA" to the object of class "BB" at runtime. This process is called "dependency injection".

+ Project must configure dependency injection.

+ One can configure either "setter dependency injection" or "constructor dependency injection".

<br>

### **Setter injection**

+ IOC container will call setter method of dependent class to inject dependency.

+ Setter injection will work repeatedly as it can be called/invoked as many times as demanded.

+ In setter injection, the dependency will be injected after creation of object of dependent class.

<br>

```
  SETTER INJECTION CONFIGURATION

    <bean name='b1' class='com.cetpa.AA' />
    <bean name='b2' class='com.cetpa.BB' />
      <property name='aa' ref='b1' />
    </bean>
```

<br>

### **Constructor injection**

+ IOC container will call parameterized constructor of dependent class to inject dependency.

+ Constructor injection will work only once upon an object's creation.

+ In constructor injection, the dependency will be injected along with the creation of object of dependent class.

<br>

```
  CONSTRUCTOR INJECTION CONFIGURATION

    <bean name='b1' class='com.cetpa.AA' />
    <bean name='b2' class='com.cetpa.BB' />
      <constructor-arg name='aa' ref='b1' />
    </bean>
```

<br>

### **Scopes of bean**

+ Scopes of the bean can be as follow:
  + Singleton scope
  + Prototype scope
  + Request scope
  + Session scope
  + Global-session scope

  <br>

  #### **Singleton scope**

  + It is default scope of every bean.

  + In this case the class of the beans will be instantiated only once during the project's lifecycle.

  + Singleton is also a design pattern.

  + Singleton scope's instantiation is eager.

  + This design pattern helps to create a singleton class.
    + Singleton class has "private static instance/field", ensures that only one instace is maintained throughout the application.
    + Singleton class has "private constructor", prevents external code from creating multiple instances.
    + Singleton class has "public static method", ensures controlled access to the single instance.

  <br>

  #### **Prototype scope**

  + In this case, beans will be created each time program will call getBean() method or program will demand bean.

  + Singleton scope's instantiation is lazy.

<br>

### **Configuration types**

+ Spring framework allows following three configuration types:
  + XML-based configuration
  + Annotation-based configuration
  + Java code based configuration

+ Four stereotype annotations:
  + Service annotation
  + Component annotation
  + Repository annotation
  + Controller annotation

<br>

### **Spring autowiring**

+ Injecting dependency automatically is called autowiring.

+ One need to set one of the following autowiring mode:
  + byName mode
  + byType mode
  + constructor mode

<br>

  #### **byName mode**

  + In this mode, name of dependency will be matched with name of configured beans.

  + Matching bean will be injected by setter injection.

  + This should be set when multiple implementations of dependency are configured.

  <br>

  #### **byType mode**

  + In this mode, type of dependency will be matched with type of configured beans.

  + Matching bean will be injected by setter injection.

  + This should be set when single implementation of dependency is configured.

  + If multiple matching beans will be available then exception will be created and thrown.
 