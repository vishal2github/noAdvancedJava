# SPRING-MVC FRAMEWORK

<br>

### **Spring-MVC framework**

+ This framework is a module of spring framework.

+ One can use this framework to build web applications.

+ This application will be MVC-based application.

<br>

### **MVC**

+ "MVC" stands for "Model-view-controller".

+ It is a design pattern.

+ It is used to separate presentation layer from business layer as well as data layer.

+ So if any change will be made in persentation layer, then business layer and data layer won't be affected.

<br>

### **Model in MVC**

+ It is an object and it encapsulates/holds presentation data.

+ Presentation data means, data that will be presented by view to the user.

+ This data will be dynamic.

+ This object (model) will be created by front controller.

+ Controller will keep/put data into this object.

+ View will get data from this object and show data to the user.

<br>

### **View in MVC**

+ This is presentation layer of the application.

+ It accepts input from user and shows output/response to the user.

+ View should be dynamic.

+ One can use HTML, CSS, and JavaScript to create design of the view.

+ To make it dynamic, one of the following template engines will be used:
  + JSP engine
  + Thymeleaf engine
  + Freemarker engine
  + Velocity engine
  + etc...

+ Dependency of the engine must be configured into the project.

<br>

### **Controller in MVC**

+ It plays vital role in MVC based project.

+ Main roles of controller are:
  + Handle HTTP request
  + Generate HTTP response
  + Send response to the browser

+ Front controller will call controller.

+ Spring-MVC project will have only one front controller, but multiple controllers.

+ Class of the controller must be annotated by using "@Controller" annotation.

+ Methods inside controller are known as handlers.

+ These methods will be called by front controller on each HTTP request.

+ We need to map handlers/methods with each HTTP request.

+ To map handlers with HTTP request, one can use "@RequestMapping" annotation.

<br>

```
  USER:REQUEST+DATA FLOW

    User → Web browser → Web server → Front controller → Controller

  USER:RESPONSE FLOW

    Controller → Front controller → Web server → Web browser → User
```

<br>

### **Configuration files**

+ Two configuration files:
  + web.xml file
  + spring-servlet.xml file

<br>

  #### **web.xml file**

  + This is deployment descriptor file.

  + Every spring-mvc project has this file.

  + In this file, one has to configure front controller as servlet.

  + Web server uses this file to know about front controller. (As known, front controller is called by web server)

  <br>

  ```
    CONFIGURATION CODE

      <servlet>
        <servlet-class> org.springframework.web.servlet.
        DispatcherServlet
        </servlet-class>
      </servlet>

      <servlet-mapping>
      </servlet-mapping>
  ```

  <br>

  #### **spring-servlet.xml file**

  + This file is used by spring framework.

  + In this file, one will have to configure the project.

  + One can configure follwings in project like:
    + Base package
    + CSS file location
    + JS file location
    + Image file location
    + viewresolver
    + beans
    + etc...

<br>

### **Front controller**

+ Every Spring-MVC project has a "front controller".

+ Front controller is responsible to perform following tasks:
  + Creating model object
  + Calling methods of controller
  + Accepting return value from methods of controller
  + Resolving views
  + Executing views
  + etc...

+ Front controller will be called by web-server.

+ In Spring-MVC project, front controller is a servlet with class name "DispatcherServlet".

+ Every request and response goes through front controller.

+ Front controller must be configured in "web.xml" file.

+ Web-server calls it and passes request and data to the front controller.

<br>

