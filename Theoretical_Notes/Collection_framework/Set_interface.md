# **SET INTERFACE/COLLECTION**

<br>

### **Set interface/collection**

+ "Set interface" is a sub-interface (child) of "Collection interface".

+ Implementation classes of set interface are known as set collection.

+ Features of Set interface:
  + Doesn't allow duplicacy of elements.
  + It is an un-ordered collection.
  + Allows single null.

<br>

### **Set interface/collection implementation classes**

+ List interface/collection has following three implementation classes:
  + HashSet class
  + LinkedHashSet class

<br>

### **HashSet class**

+ It is an implementation of Set interface.

+ It creates an instance of HashMap class and uses this object to keep elements.

+ HashMap internally creates HashTable of size "60". 

<br>

```
  HASHSET CLASS OBJECT CREATION

    HashSet<String> obj = new HashSet<String>();  // Using String class datatype
    HashSet<Integer> obj = new HashSet<Integer>();  // Using Wrapper class datatype
    HashSet<E> obj = new HashSet<E>();  // Using Generic datatype
```
