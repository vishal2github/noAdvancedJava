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
