# TheBibleProverbs

Hello world!

Implement hashtable with linked list
arraylist vs linked list vs double linked list (implement them)
implement string builder
hash table collition resolution
bit in long, int, ect

Main difference between ArrayList and vector is that vectors can be used in multithreaded environment because its method are synchronized.
HashMap is non synchronized and not thread safe.On the other hand, HashTable is thread safe and synchronized.

All three classes implement the Map interface and offer mostly the same functionality. 
The most important difference is the order in which iteration through the entries will happen:

HashMap makes absolutely no guarantees about the iteration order. It can (and will) even change completely when new elements are added.

TreeMap will iterate according to the "natural ordering" of the keys according to their compareTo() method (or an externally supplied Comparator). Additionally, it implements the SortedMap interface, which contains methods that depend on this sort order.

LinkedHashMap will iterate in the order in which the entries were put into the map

"Hashtable" is the generic name for hash-based maps. In the context of the Java API, Hashtable is an obsolete class from the days of Java 1.1 before the collections framework existed. It should not be used anymore, because its API is cluttered with obsolete methods that duplicate functionality, and its methods are synchronized (which can decrease performance and is generally useless). Use ConcurrrentHashMap instead of Hashtable.


+ http://www.javamadesoeasy.com/2015/02/hashmap-custom-implementation.html
+ http://stackoverflow.com/questions/4453476/hash-how-does-it-work-internally
------ https://en.wikipedia.org/wiki/Hash_function#Hash_function_algorithms


- http://www.javamadesoeasy.com/2015/02/linkedhashmap-custom-implementation.html
+ http://www.javamadesoeasy.com/2015/02/arraylist-custom-implementation.html
- http://www.javamadesoeasy.com/2015/01/doublylinkedlist-insert-and-delete-at.html

- http://www.javamadesoeasy.com/2015/02/set-custom-implementation.html
- http://www.javamadesoeasy.com/2015/02/linkedhashset-custom-implementation.html

