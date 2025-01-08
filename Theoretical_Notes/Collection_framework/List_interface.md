# **LIST INTERFACE/COLLECTION**

<br>

### **List interface/collection**

+ "List interface" is a sub-interface (child) of "Collection interface".

+ Implementation classes of List interface are known as list collection.

+ It has several methods of its own as well like:
  + public void add(int index, E element)
  + public E remove(int index)
  + public E get(int index)
  + public E set(int index, E element)
  + etc...

+ Features of List interface includes:
  + Allows duplicacy of elements.
  + It is an ordered collection.
  + Allows multiple nulls.

<br>

```
  FACT: Set collection is contrast of list collection.
```

<br>

### **List interface/collection implementation classes**

+ List interface/collection has following three implementation classes:
  + Array-list class
  + Linked-list class
  + Vector class

<br>

### **Array-list class**

+ Written as **"ArrayList".**

+ It is an implementaion of "List interface".

+ It creates and uses resizable array of type "E" and size "10" to keep elements.

<br>

```
  HOMOGENEOUS LIST-COLLECTION EXAMPLE (can take only String type of arguments):

    ArrayList<String> list1 = new ArrayList<String> ();
    list1.add("Value1");
    list1.add("Value2");
    list1.add("Value3");
_______________________________________________________________________________________

  HOMOGENEOUS LIST-COLLECTION EXAMPLE (can take only Product type of arguments):

    ArrayList<Product> list2 = new ArrayList<Product> ();
    list2.add(new Product()); // Product object's reference will be taken
    list2.add(new Product()); // Product object's reference will be taken
    list2.add(new Product()); // Product object's reference will be taken
_______________________________________________________________________________________

  HETEROGENEOUS LIST-COLLECTION EXAMPLE (can take all types of arguments):

    ArrayList list3 = new ArrayList();
    list3.add(new Product());
    list3.add("StringValue");
    list3.add(new Customer);
_______________________________________________________________________________________
  
  MORE EXAMPLES:

    ArrayList<Product> list1 = new ArrayList<Product>();
    ArrayList<Employee> list2 = new ArrayList<Employee>();
    ArrayList list3 = new ArrayList();

      • list1 will be 'Homogeneous' and 'Product type array' and can hold only 'Product-type' elements.
      • list2 will be 'Homogeneous' and 'Employee type array' and can hold only 'Employee-type' elements.
      • list3 will be 'Heterogeneous' and 'Object type array' and can hold any type of elements.
```

<br>

### **Linked-list class**

+ Written as **"LinkedList".**

+ It is an implementaion of "List" and "Deque" interfaces.

+ Means, it has properties of both List and Deque interfaces.

+ Few methods of Deque interface implemented in this class are:
  + public void addFirst(E element)
  + public void addLast(E element)
  + public E removeFirst()
  + public E removeLast()
  + public E getFirst()
  + public E getLast()
  + etc...

+ Linked list is categorized in three forms:
  + Single linked-list
  + Doubly linked-list
  + Circular linked-list

+ Linked-list class creates and uses doubly linked list to keep elements.

<br>

```
  NOTE

    • "Linked-list class" and "linked-list data-structure" are two different concepts.
```

<br>

### **Array-list vs DSA-linked-list**

+ Array has a fixed size, while the size of linked-list isn't fixed.

+ Array can neither grow nor shrink, while linked-list can grow and shrink.

+ Memory allocation is static in an array, while it is dynamic for linked-list.

+ Memory allocation is in contiguous in an array, while it is in scattered way for linked-list.

+ Array works on concept of indexing, and linked-list works on concept of noding.

<br>

### **Vector class**

+ Written as **"Vector".**

+ It is an implementaion of "List interface".

+ It is a legacy class introduced in JDK 1.0.

+ It creates and uses resizable array of type "E", and size "10" to keep elements like Array-list class.

+ Vector class is a synchronized class and Array-list class is unsynchronized class.

<br>

```
  NOTE

  • Legacy classes/interfaces were introduced in JDK 1.0
    ‣ Vector class
    ‣ Hash-table class
    ‣ Enumeration interface used for iteration
```

<br>

  #### **Stack class**

  + It is a child of vector class.

  + It has all methods of Vector class, and few own methods such as:
    + public void push(E element)
    + public E pop()
    + public E peek()
    + etc...
