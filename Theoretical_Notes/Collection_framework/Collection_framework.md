# COLLECTION FRAMEWORK

+ If a program is creating the multiple objects from same class then array is better option.
+ If that object is storing data (and not part of UI) and object's total creation quantity is unknown, then collection framework is to be considered.
+ Collection framework's purupose is to store/manage the obejct's reference, in other words, to store/manage objects in memory.
+ Data-objects are created during runtime on demand.
+ Array-objects are also created during runtime, but these are already created in starting of a loop.

+ Object's management by collection framework includes:
  + Keeping objcts (Object's reference)
  + Removing objects (Object's reference)
  + Iterating objects (Object's reference)
  + Sorting objects (Object's reference)
  + Searching objects (Object's reference)

+ 'java.util' package contains interfaces and classes of collection framework.
+ Collection framework was introduced in JDK 1.2.
+ Collection framework was made generic in JDK 1.5.
+ The abstract method is defined inside abstract class when the method is to be inherited in child class.
+ If classes want to implement methods, then those methods should be defined under an interface.
+ 'Method's body' is allowed in an interface from Java 8 onwards, but method must be 'static' or 'default' type.
+ 'Static method' isn't visible, and 'default method' is visible, inside 'implementation class', so 'implementation class' can't overwrite 'static method' but can overwrite 'default method'.

```
  From Java 8 and onwards, allowance of 'method body' in an interface ? Why?
    Because...
```
