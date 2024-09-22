# OBJECT AND REFERENCE VARIABLE

+ In array, to specify the 'type' of an array isn't needed to declare an object.
+ In collection, the 'type (collection type)' is mandatory to declare an object.

```
  OBJECT DELARATION VIA ARRAY:
    ArrayList obj1 = new ArrayList();  // No array type is needed to be specified

  OBJECT DELARATION VIA COLLECTION:
    ArrayList <String> obj1 = ArrayList <String> ();  Collection type is 'String'
    or
    ArrayList <Product> obj1 = ArrayList <Product> ();  // Collection type is 'Product (supposed class)'
```

+ Reference variable 'type' will either be a class or an interface, hence, object's reference will be kept in that reference variable.
+ If reference variable has 'type' of class, the object reference of that class or its child class will be kept in that reference variable.
+ If reference varaible argument 'type' is interface, then the object's reference of that class (implementation class, which implements that interface) will be kept in that reference variable.
