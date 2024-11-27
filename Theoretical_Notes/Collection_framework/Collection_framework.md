# COLLECTION FRAMEWORK

<br>

### **Collection in Java**

+ Individual items packed in single unit is collection in Java.
+ Collection is like container that merge multiple items in a single unit.
+ **Example:** In layman's term, a bundle of sticks. In technical term, a list of employee names (list is java collection).

+ Two principal root interfaces of Java collection classes:
  + **Collection interface** (Under "java.util.Collection")
  + **Map interface** (Under "java.util.Map")

<br>

### **Collection framework**

+ Collection framework in Java is unified architecture that represents/provides a collection of interfaces and classes to manage objects.
+ It helps in managing (storing/processing) objects (data) efficiently.
+ Program keeps data into objects and objects will be managed by collection framework.
+ Program will call methods of these interfaces to manage obejcts.
+ If a program is creating the multiple objects from same class then array is better option.
+ If that object is storing data (and not part of UI) and object's total creation quantity is unknown, then collection framework is to be considered.
+ **Purpose:** Collection framework's purpose is to store/manage the obejct's reference, in other words, to store/manage objects in memory.
+ Data-objects are created during runtime on demand.
+ Array-objects are also created during runtime, but these are already created in starting of a loop.

+ Object's management by collection framework includes:
  + **Keeping objects** (Object's reference)
  + **Removing objects** (Object's reference)
  + **Iterating objects** (Object's reference)
  + **Sorting objects** (Object's reference)
  + **Searching objects** (Object's reference)

+ "java.util" package contains interfaces and classes of collection framework.
+ Collection framework was introduced in JDK 1.2.
+ Collection framework was made generic in JDK 1.5.
+ The abstract method is defined inside abstract class when the method is to be inherited in child class.
+ If classes want to implement methods, then those methods should be defined under an interface.
+ Method's body is allowed in an interface from Java 8 onwards, but method must be "static" or "default" type.

+ **Difference between static and default methods of an interface**
  + Static method isn't visible, and default method is visible, inside implementation class.
  + So implementation class can't overwrite static method but can overwrite default method.

<br>

```
  From Java 8 and onwards, allowance of method's body in an interface? Why?
    Because...
```

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
  + List interface
  + Tree-set class
  + Priority-queue class
  + etc...

<br>

### **Advantages of Java Collection Framework**

+ API consistency
+ Reduced programming exertion
+ Increased program quality and speed
