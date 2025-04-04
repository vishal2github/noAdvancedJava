# **COLLECTION FRAMEWORK**

<br>

### **Collection in Java**

+ Individual items packed in single unit is **collection** in Java.

+ Collection is like container that merge multiple items in a single unit.

+ **Example:** In layman's term, a bundle of sticks. In technical term, a list of employee names _(list is java collection)_.

+ Two principal root interfaces of Java collection classes:
  
  + **Collection interface** _(Under "java.util.Collection")_
  
  + **Map interface** _(Under "java.util.Map")_

<br>

### **Collection framework**

+ Collection framework in Java is unified architecture that represents/provides a collection of interfaces and classes to manage objects.

+ It helps in managing _(storing/processing)_ objects _(data)_ efficiently.

+ Program keeps data into objects and objects will be managed by collection framework.

+ Program will call methods of these interfaces to manage obejcts.

+ If a program is creating the multiple objects from same class then array is better option.

+ If that object is storing data _(and not part of UI)_ and object's total creation quantity is unknown, then collection framework is to be considered.

+ **Purpose:** Collection framework's purpose is to store/manage the obejct's reference, in other words, to store/manage objects in memory.

+ Data-objects are created during runtime on demand.

+ Array-objects are also created during runtime, but these are already created in starting of a loop.

+ Object's management by collection framework includes:
  
  + **Keeping objects** _(Object's reference)_
  
  + **Removing objects** _(Object's reference)_
  
  + **Iterating objects** _(Object's reference)_
  
  + **Sorting objects** _(Object's reference)_
  
  + **Searching objects** _(Object's reference)_

+ **java.util** package contains interfaces and classes of collection framework.

+ Collection framework was introduced in JDK 1.2.

+ Collection framework was made generic in JDK 1.5.

+ The abstract method is defined inside abstract class when the method is to be inherited in child class.

+ If classes want to implement methods, then those methods should be defined under an interface.

+ Method's body is allowed in an interface from Java 8 onwards, but method must be "static" or "default" type.

+ **Difference between static and default methods of an interface**
  
  + Static method isn't visible, and default method is visible, inside implementation class.

  + So implementation class can't overwrite static method but can overwrite default method.

<br>

### **Allowance of method's body in an interface from Java 8 onward, why?**

+ In Java 8 and onward, method bodies are allowed in interfaces and made possible by introduction of:

  + Default methods

  + Static methods

+ **Default methods**

  + Method(s) in interface having a body _(implementation)_.

  + Defined using **default** keyword in interface.

  + Introduced to allow developers to add new methods to interfaces without breaking existing implementations of interface.

+ **Static methods**

  + A static method in interface is like static method in class.

  + Belongs to interface itself and isn't inherited by implementing classes.

  + Static method(s) allow utility/helper methods to be encapsulated within interface.

+ **Primary reasons for method's body allowance in interface:**

  + **Backward compatibility**

    + Improve backward compatibility with existing code.

    + Allows default methods in interfaces, enables new methods to be added without breaking existing code that implements that interface.

    + Ultimately prevents forcing all existing implementations to change.
  
  + **Code reusability**

    + "Code reuse" and "boilerplate reduction" in implementing classes.

    + Default methods allow code reuse within interfaces.

    + Instead of forcing every implementing class to define the same method body, the interface can provide a default implementation that is automatically available to all implementing classes.
  
  + **Functional programming paradigms**

    + Support new programming paradigms like functional programming.

    + Default methods allow interfaces to have methods with implementations that can be used in combination with functional interfaces.
  
  + **Common behavior encapsulation**

    + Default methods allow common behavior to be provided directly in interface, which can be reused by all implementaing classes without needing to duplicate the implenetation.

    + Leads to cleaner code and better maintainability.
  
  + **Interoperability with existing libraries**

    + Default methods helps libraries _(like Java's Collection framework)_ evolve without breaking backward compatibility.

<br>

### **Collection framework and interface**

+ Several interfaces includes:
  
  + Collection interface
  
  + List interface
  
  + Set interface
  
  + Queue interface
  
  + De-queue interface
  
  + Sorted-set interface
  
  + etc...

+ Several classes includes:
  
  + Array-list class
  
  + Linked list class
  
  + Vector class
  
  + Hash-set class
  
  + Linked-hash-set class
  
  + Tree-set class
  
  + Priority-queue class
  
  + etc...

<br>

### **Advantages of Java Collection Framework**


+ API consistency

+ Reduced programming exertion

+ Increased program quality and speed
