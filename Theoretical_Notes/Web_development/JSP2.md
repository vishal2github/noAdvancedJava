# **JSP - WEB LISTENER, APPLICATION OBJECT, AND SESSION OBJECT**

<br>

### **Implementing web-listener**

+ One can create this listener in the project.

+ This listener will be executed by web-server on deployment of project on web-server, or upon starting of web-server.

+ It means this **listener will be executed only once during the life cycle** of project.

+ Web-server calls listener after creating object of **ServletContext** interface.

+ This object is created by web-server, when project is deployed on web-server, or upon starting of web-server.

<br>

### **Application object**

+ It is an object of **ServletContext** interface.

+ Web-server creates this object when project is deployed on web-server, or upon starting of web-server.

+ In this object, the project can keep data or reference of object in the form of key-value pair.

+ Every JSP page and servlet has reference of this object.

<br>

### **Session object**

+ It is an object of **HttpSession** interface.

+ Web-server creates session object on initial request of the user/browser.

+ For each web browser, server creates a separate objects.

+ Every servlet and JSP page has reference of session object.

+ In session object, data can be kept in key-value pair.

+ Every servlet and JSP page has reference of session object.

+ Data kept into session object can be accessed by every JSP page and servlet.
