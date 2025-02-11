# **JSP**

<br>

### **JSP (Java Server Pages)**

+ **JSP** stands for **Java Server Pages**.

+ JSP is part of Java EE platform and is great option for developing **web-based applications** in Java.

+ By using this technology, one can build "dynamic web pages", as JSP allows to embed **Java code** directly into **HTML pages** for creating dynamic content.

+ Building web-application/dynamic web pages using JSP technology is much convenient than using servlet technology.

+ Every JSP page is translated into servlets by web-server, and this servlet is called an auto-generated servlet.

+ Inside JSP page, one can write HTML, CSS, and Java codes directly.

+ JSP pages are essentially **HTML files** with Java embedded into them.

+ JSP pages are processed on server side to generate dynamic content.

+ Once the JSP papge is requested by a client-browser, the server processes the Java code withing the page, and results are sent back to client as **HTML**.

+ Entire code of JSP page will be inserted into "service method" of auto-generated servlet by the web-server.

+ Using JSP technology, one can write/inject HTML, CSS, and Java code in JSP pages to enhance the dynamic web-pages with logics.
  + While it wasn't possible in servlets HTML pages.

+ Writing Java code inside JSP page means writing code inside "service method" of an auto-generated servlet.
  + Hence, no need to make a separate servlet class, like in servlet technology.

<br>

### **JSP concepts and components**

#### **JSP tags**

+ JSP allows embedding Java code using specific **tags** within the HTML file.

+ Some common ones includes:

  + **<% %>** used to embed Java code.

  + **<%= %>** used to output the result of a Java expression.

  + **<%! %>** used for declaring variables and methods in JSP.

  + **<%@ %>** used for directives, like specifying imports or defining page properties.

<br>

#### **JSP lifecycle**

+ JSP page lifecycle involves several key steps:

  + **Compilation:** The JSP page is compiled into a **servlet** by the web server _(like, Tomcat)_.

  + **Request processing:** The compiled servlet processes incoming HTTP requests and generates dynamic content.

  + **Response rendering:** The servlet sends the generated content back to the client _(usually in the form of HTML)_.

<br>

#### **JSP directives**

+ **Page directive:** Specifies attributes like the content type, language, and import statements.

<br> 

```
  PAGE DIRECTIVE

    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
```

<br>

+ **Include directive:** Used to include static content or files in a JSP page.

<br>

```
  INCLUDE DIRECTIVE

    <%@ include file="header.jsp" %>
```

<br>

+ **Taglib directive:** Defines a custom tag library that can be used in a JSP page.

<br>

```
  TAGLIB DIRECTIVE

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
```

<br>

#### **JSP expressions, scripting elements, and actions**

+ **Expression:** Outputs the value of an expression directly in the response stream.

<br>

```
  EXPRESSION

    <%= "Hello, World!" %>
```

<br>

+ **Scripting elements:** Java code embedded directly in the page.

<br>

```
  SCRIPTING ELEMENT

    <% int counter = 0; %>
```

<br>

+ **Actions:** JSP tags used for specific functionality, such as forwarding requests, including resources, etc.

<br>

```
  ACTION

    <jsp:forward page="nextPage.jsp"/>
```

<br>

### **Working of JSP technology**

+ When user requests JSP page, the following happens:

  + **Initial request:** The request for the JSP page is sent to the web server.

  + **JSP compilation:** If the JSP hasn't been compiled yet (or if there are changes), the server compiles the JSP into a **Java servlet.**

  + **Servlet execution:** The generated servlet handles the client request, processes the embedded Java code, and creates an HTML response.

  + **Response to client:** The processed HTML content is sent back to the client browser.

<br>

### **Benefits of JSP**

+ **Separation of concerns**

  + JSP helps in separating the **presentation layer** (HTML and CSS) from the **logic layer** (Java code).

  + However, JSP can be used with **Servlets** or **JavaBeans** to make the application more modular.

+ **Reusable code**

  + **Components, tags,** and **JavaBeans** withing JSP pages can be reused to avoid redundancy and improve maintainability.

+ **Dynamic content generation**

  + JSP is perfect for dynamic web-applications.

  + As, content changes based on user input, database interaction, or session data.

+ **Integration with servlets**

  + JSP pages can be integrated with servlets for handling business logic and presenting results to users.

<br>

### **JSP with MVC**

+ Many web applications use **JSP** as part of the **Model-View-Controller (MVC)** architecture.

+ **Model**

  + Handles data, logic, and communication with the database (often represented by JavaBeans or POJOs).

+ **View (JSP)**

  + The **JSP page** is the view that displays the data.
  
  + It is reponsible for formatting and displaying content to the user.

+ **Controller**

  + A **servlet** acts as the controller.

  + It processes the user request, fetches the data, and forwards the result to a JSP page.

+ In this architecture:

  + **Servlet** acts as the **controller,** handling requests and forwading them to the right JSP.

  + **JSP** acts as the **view,** rendering HTML and displaying dynamic content.
  