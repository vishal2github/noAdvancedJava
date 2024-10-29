# LIST INTERFACE/COLLECTION

<br>

### **List interface/collection**

+ "List interface' is a child of 'collection interface'.
+ Implementation classes of list interface are known as list collection.

+ Features of list interface includes:
  + Allows duplicacy of elements.
  + It is an ordered collection.
  + Allows multiple nulls.

+ It has several methods of its own as well like:
  + public void add(int index, E element)
  + public E remove(int index)
  + public E get(int index)
  + public E set(int index, E element)

<br>

```
  FACT: Set collection is contrast of list collection.
```

<br>

### **List interface/collection implementation classes**

+ List interface/collection has following three implementation classes:
  + ArrayList class
  + LinkedList class
  + Vector class

<br>

### **ArrayList class**

+ Written as 'arrayList'.
+ It is an implementaion of 'List interface'.
+ It creates and uses resizable array of type E and size 10 to keep elements.

```
  HOMOGENEOUS LIST-COLLECTION EXAMPLE (can take only String type of arguments):

    ArrayList <String> list1 = new ArrayList <String> ();
    list1.add("Value1");
    list1.add("Value2");
    list1.add("Value3");
_______________________________________________________________________________________

  HOMOGENEOUS LIST-COLLECTION EXAMPLE (can take only Product type of arguments):

    ArrayList <Product> list2 = new ArrayList <Product> ();
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

    ArrayList <Product> list1 = new ArrayList <Product>();
    ArrayList <Employee> list2 = new ArrayList <Employee>();
    ArrayList list3 = new ArrayList();

      > list1 will be 'Homogeneous' and 'Product type array' and can hold only 'Product-type' elements.
      > list2 will be 'Homogeneous' and 'Employee type array' and can hold only 'Employee-type' elements.
      > list3 will be 'Heterogeneous' and 'Object type array' and can hold any type of elements.
```
