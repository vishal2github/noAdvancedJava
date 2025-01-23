# **SERVLETS (SERVER-SIDE PROGRAMS)**

<br>

### **Servlets technology**

+ Servlets are also known as 'server-side programs'.

+ To generate/produce an HTTP response dynamically, the server-side programs are needed to be built.

+ Servlets technology is used to generate response dynamically and to process the HTTP requests.

+ Web server manages the life cycle of these programs.

+ These programs will perform following tasks:
  + Handling HTTP request
  + Generating HTTP response
  + Sending HTTP response to the client _(browser)_

<br>

### **Building these programs**

+ In the source code of these programs, following interfaces and classes are used:
  + Servlet interface
  + ServletRequest interface
  + ServletResponse interface  
  + ServletContext interface  
  + ServletConfig interface
  + HttpSession interface
  + HttpServletRequest interface
  + HttpServletResponse interface
  + etc...

  + GenericServlet class
  + HttpServlet class
  + Cookie class
  + etc...

+ These interfaces and classes are available in following two packages:
  + java.servlet
  + javax.servlet.http
  
  + **Note**
    + These two packages are in **servlet-api.jar** library.

    + Configuration path is required of this 'jar file' into proejct in order to use above interfaces and classes.

<br>

### **Servlet interface**

+ Class of the server-side program (servlets) must implement 'servlet interface' either directly or in-directly.

+ Servlet interface has five methods:

  + **Lifecycle and web-server-called methods:**
    + public void init(ServletConfig config)
    + public void service(ServletRequest request, ServletResponse response)
    + public void destroy()

  + **Non-lifecycle methods:**
    + public String getServletInfo()
    + public ServletConfig getServletConfig()

<br>

```
  SERVLET SYNTAX

    @WebServlet("/demo")
    public class DemoServlet implements Servlet
    {
        // override all 5 methods of Servlet interface
    }


  REMEMBER

    • It is mandatory to provide servlet url-pattern also.
```

<br>

### **Servlets lifecycle**

+ Web server manages life cycyle of servlets.

+ It has following five phases:
  
  + **Loading servlet class** _(Done only once)_

  + **Instantiating servlet class** _(Done only once)_

  + **Initializing servlet** _(Done only once. In this case, "init()" lifecycle method will be called and object of ServletConfig interface will be passes to this method by web server)_
  
  + **Processing HTTP request and generating HTTP response** _(Done each time web services recieve request for this servlet. In this case, web server calls service life cycle method as passes obejct of ServletRequest and ServletResponse interface)_
  
  + **Destroying servlets** _(Done one once. Web server destroys servlets when web server terminates/restarts. In this case, web server calls "destroy()" lifecycle method)_

+ Socket programming:
  
  + It's a way of connecting two nodes on a network to communicate with each other.
  
  + Once socket (node) listens on a particular port at an IP.
  
  + While other socket reaches out to the other to form a connection.
  
  + The server forms the listener socket while the client reaches out to the server.

+ **HTTP response status:** Indicate whether specific HTTP request has been successfully completed.

  + Responses are grouped in five classes:
    + 1 series (100 - 199) - Informational response
    + 2 series (200 - 299) - Success response
    + 3 series (300 - 399) - Redirectional response
    + 4 series (400 - 499) - Client/browser error-response
    + 5 series (500 - 599) - Server error-response

<br>

### **HttpServlet class**

+ It is child of GenericServlet class.

+ GenericServlet class is an implementation of Servlet interface.

+ HttpServlet class has implemented all methods of Servlet interface and has several own methods.

+ Few methods of HttpServlet class are as follows:

  + public void service(HttpServletRequest request, HttpServletResponse response)

  + public void doGet(HttpServletRequest request, HttpServletResponse response)

  + public void doPost(HttpServletRequest request, HttpServletResponse response)

  + public void doDelete(HttpServletRequest request, HttpServletResponse response)

  + public void doPut(HttpServletRequest request, HttpServletResponse response)

  + etc...

+ **Note**

  + Instead of extending/inheriting servlet interface, making a "servlet" by extending/inheriting "HttpServlet" class is a better option.

  + Because, in our servlet, there's need of only service() method, and if "Servlet" interface is used for this purpose then all methods body will needed to be defined.

  + And in case of "HttpServlet" class extention, only required method's body will be defined.

<br>

### **Service method calling**

+ _Servlet interface service method (orignal service method)._

+ _HttpServlet class service method (duplicate service method)._

<br>

+ Web server will call original service method.

+ Original service method is overridden by "HttpServlet" class.

+ Original service method will call duplicate service method.

+ Remember, duplicate service method is overridden by your/our servlet.

+ If both service methods are overridden in your/our servlet class, then original service method will run.

<br>

### **Request object**

+ It is an object of "ServletRequest" interface.

+ Web server creates this object and passes reference of this object to service method.

+ In this object, web server keeps serveral information (The information that web server is recieving from browser).

+ In this object data is kept into key-value pair.

+ Service method can call "getter" method to get data from this object.
