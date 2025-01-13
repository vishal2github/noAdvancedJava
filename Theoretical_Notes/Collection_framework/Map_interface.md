# **MAP INTERFACE**

<br>

### **Map interface**

+ "Map" interface isn't a child of Collection interface, so it's not treated as collection.

+ Map is used to keep elements in key-value pair.

+ Key makes management of elements easy.

+ Key-value pairs inside map is called an entry.

  + This entry will always be unique and might be unordered.
  
  + Here, key will be unique and value can be duplicate.

+ Map is not iterable. While all collections (list, set and queue) are iterable.

+ For entries iteration in Map, "entrySet" method of Map interface is invoked.
  + Then, "entrySet" method will create a Set collection of entries using Map.Entry object and return reference of Set collection.
  + And, Set collection has iterable feature. So Map entries iteration is possible in this way by using "for-each" or Iterator interface techniques.

+ Map interface has following two implementations:
  + HashMap class
  + LinkedHashMap class

<br>

### **HashMap class**

+ It creates and uses instance of "Map.Entry" to keep elements. (Entry interface is nested interface of Map)

+ It means Map collection keeps object of Map.Entry class.

+ It restricts key's duplicacy, but allows for the value's duplicacy.

<br>

```
  FACTS

    • Map creates HashTable internally via hashing technique.
    • Map keeps data in key-value pair in HashTable via "Map.Entry".
    • The reference of "Map.Entry" will be kept in HashTable.
    • In JDK 1.0, HashTable was introduced.
    • In JDK 1.2, collection framework (hence, HashMap) was introduced.
    • HashMap works on same principle of hashing as of HashTable.
    • The difference is, HashMap is unsynchronized, HashTable is synchronized.
```

<br>

### **LinkedHashMap class**

+ It is implementation of Map interface and child of HashMap class.

+ It maintains insertion order of entries.

<br>

### **TreeMap class**

+ It is implementation of SortedMap interface, and SortedMap interface is a child of Map interface.

+ It keeps entries in ascending or descending order of keys.

+ It invokes "compareTo" method of Comparable interface to compare keys.
