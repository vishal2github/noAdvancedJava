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

<br>

### **Hashcode**

+ The methods of object class are:
  + public int hashCode()
  + public boolean equals(Object obj)

+ "HashCode" method of Object class generates a unique hashcode number of the object whose reference is given to it and returns that hashcode number.

+ It generates hash number by using reference of the object.

+ But, hashCode method is over-ridden by String class and wrapper classes.

+ It generates hash number by using value of the object of wrapper classes.
