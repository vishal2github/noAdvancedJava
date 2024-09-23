# ARRAY_LIST CLASS

+ Written as 'arrayList'.
+ It is an implementaion of 'List interface'.
+ It creates and uses resizable array of type E and size 10 to keep elements.

```
  // Homogeneous list-collection example 1 (can take only String type of arguments)
  ArrayList <String> list1 = new ArrayList <String> ();
  list1.add("Value1");
  list1.add("Value2");
  list1.add("Value3");

  // Homogeneous list-collection example 2 (can take only Product type of arguments)
  ArrayList <Product> list2 = new ArrayList <Product> ();
  list2.add(new Product()); // Product object's reference will be taken
  list2.add(new Product()); // Product object's reference will be taken
  list2.add(new Product()); // Product object's reference will be taken

  // Heterogenous list-collection example (can take all types of arguments)
  ArrayList list3 = new ArrayList();
  list3.add(new Product());
  list3.add("StringValue");
  list3.add(new Customer);
```
