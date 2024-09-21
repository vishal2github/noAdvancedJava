# COLLECTION INTERFACE

+ All collections including List, Set, and Queue collections have methods of this interface.
  + List collection
  + Set collection
  + Queue collection

+ Collection interface has several methods like:
  + public boolean add(E element) 
  + public boolean remove(E element)
  + public boolean contains(E element)
  + public boolean isEmpty()
  + public int size()
  + public void clear()
  + public boolean addAll(Collection c)
  + public booean removeAll(Collection c)
  + public boolean retainAll(Collection c)
  + public Iterator iterator()

```
  Note: 'E' is a class of generic/type-parameter of an element.
```

+ An implementation-class is created using an interface implementation.
+ If an argument or variable is of interface type, then in that argument or variable one can put the implementation class's obeject's reference.
+ If method's return type is class, then object's reference of that class will be returned.
+ If method's return type is interface, then object's reference of implemented class of that interface will be returned.
+ If method's return type is iterator, then it will return an object's reference of an iterator-interface implementing class.

<br>

### Homogeneous Collection Examples

```
    Example 1
    ArrayList <String> list1 = new ArrayList <String>();
    list1.add("Hello");
    list1.add(10); // Error: Only string accepted

    Example 2
    ArrayList <Product> list1 = new ArrayList <Product>();
    list1.add(new Product());
    list1.add("Hello"); // Error: Only Product object's reference accepted
    list1.add(10); // Error: Only Product object's reference accepted
  ```

<br>

### Interface vs class inheritance

+ Java supports an interface inherite of multiple interfaces.
+ Java doesn't support the class inherite of multiple classes.

<br>

### Collection interface childs

+ List interface
+ Set interface
+ Queue interface

<br>

### List interface

+ It is a child of collection interface.
+ It has several methods of its own as well like:
  + public void add(int index, E element)
  + public E remove(int index)
  + public E get(int index)
  + public E set(int index, E element)