# **WEB SERVICES**

<br>

### **Web services**

+ It runs on web server like web application.

+ Methods of this service will be called remotely by front-end.

+ These methods are known as **Web-APIs.**

+ APIs can be of following two types:
  + SOAP APIs (Simple Object Access Protocol)
  + REST APIs (Representational State Transfer)

+ The REST APIs are build using Spring-Boot framework.

+ Any front-end application can call these APIs remotely.

+ Developing RESTful API is much easier than developing web applications.

<br>

### **SOAP API**

+ SOAP stands for "Simple Object Access Protocol".

+ SOAP APIs are traditional APIs.

+ It has several limitations:
  + Calling these APIs by client application (front-end) is very complex.

  + That's why REST API is more popular.

<br>

### **REST API**

+ REST stands for "Representational State Transfer".

+ Building and calling REST API is much easier than SOAP API.

+ REST supports all protocols and data exchange formats _(JSON, XML, txt, etc.)_.

<br>

### **XML format**

+ XML stands for "Extensible Markup Language".

<br>

```
  XML FORMAT SYNTAX

    <?xml version="1.0">
    <product>
      <pid>101</pid>
      <name>Mouse</name>
      <brand>Logitech</brand>
      <price>600</price>
    </product>
```

<br>

### **JSON format**

+ JSON stands for "JavaScript Object Notation".

<br>

```
  JSON FORMAT SYNTAX

    {
      "pid": 101,
      "name": "Mouse",
      "brand": Logitech,
      "price": 600
    }
```

<br>

### **@RestController annotation**

+ It is combination of following two annotations:
  + @Controller annotation
  + @ResponseBody annotation

+ In RESTful API, development this annotation is used to create controller class.

+ Methods of this controller will be called by API.

+ To create/define those methods, following annotations can be used:
  + @GetMapping
  + @PostMapping
  + @DeleteMapping
  + @PutMapping
  + @PatchMapping
  + etc...

+ These methods will generate and return response to the client application (front-end).

+ Return type of these methods should be "ResponseEntity class".

<br>

### **ResponseEntity class**

+ Methods of RESTful API create and return object of this class to the front controller as response body.

+ In this object API can keep both response status code (such as 200, 201, 404, etc) and reference of entity class object.

<br>

### **Response status codes**

+ HTTP response status codes indicate whether a specific HTTP request has been successfully completed.

+ Responses are grouped in five classes:
  + Informational responses (100 - 199)
  + Successful responses (200 - 299)
  + Redirection messages (300 - 399)
  + Client error responses (400 - 499)
  + Server error responses (500 - 599)

+ One need to keep HTTP response status code in the object of "ResponseEntity" class.
  + Constants can be used instead of direct values.

<br>

```
  DECLARATION SYNTAX

    ResponseEntity response = ResponseEntity.status(HttpStatus.OK).body(object);

    ResponseEntity response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    • Anyone syntax can be used in habit
```

<br>

### **Types of API**

+ Following types of APIs can be build:
  + GET APT (To get resource)
  + POST API (To create resource)
  + PUT API (To update resource as well as create resource)
  + DELETE API (To delete resource)
  + PATCH API (To update resource partially)
  + etc...

+ Here, GETPOST, PUT, DELETE, PATCH are http request methods.

<br>

  #### **Difference between POST and PUT methods**

  + POST method is used to create resource only.

  + PUT method is used to update create resource if resource exists or create resource if resource doesn't exist.

  + POST method is non-idempotent method.

  + PUT method is idempotent method.
  