# SERVLETS (SERVER-SIDE PROGRAMS)

<br>

### **Servlets technology**

+ Servlets are also known as 'server-side programs'.
+ To generate/produce an HTTP response dynamically, the server-side programs are needed to be built.
+ Servlets technology is used to generate response dynamically and to process the HTTP requests.
+ Web server manages the life cycle of these programs.

+ These programs will following tasks:
  + Handling HTTP request
  + Generating HTTP response
  + Sending HTTP response to the client (browser)

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

```
  SYNTAX OF SERVLET:

    @WebServlet("/demo")
    public class DemoServlet implements Servlet
    {
        // override all 5 methods of Servlet interface
    }
___________________________________________________________

  REMEMBER:

    It is mandatory to provide servlet url-pattern also.
```
