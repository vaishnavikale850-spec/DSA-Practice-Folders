/*
Iterable --> Map(interface)--> hashmap, linked hashmap, tree map
Iterable --> Collection(interface) --> list, set, queue,etc.

Collection(interface) in java = A framework to store, manage and maniputlate group of object dynamically.

Colllection are expandable container & which can contains dynamically sizing not like arrays having fixed sizing.

Collection = classes(storing data) + interfaces(retrive and manipulate data)
Collection Features= 
1. Dynamic Sizing
2. Built-in methods(add(), remove(), contains())
3. Sorting(Collections.sort())
4. Searching
5. Iteration support
 Interfaces having types collection( classes + interfaces)  and map data structure.
collection includes = List, Set, Queue.

classes :
1. List Implementation = ArraysList, LinkedList, Vector
2. Set Implementation = HashSet, LinkedSet, TreeSet
3. Queue Implementation = Priority Queue, Array Deque = open end queue works on FIFO proerty.

HashMap(I) = It is a data structure to store key : value pairs and having O(1) time complexity for insertion, deletion, containing element in hashmap. It is mostly used in precomputation and fetching using hash function.

Features = 
1. Unique key
2.Allows duplication value
3. Unordered
4. Null key allowed only 1
5. Null value allowed
6. Multithreading unsafe = another interfaces = concurrent hashmap , collection synronizationMap()
7. Resizing (Rehashing)= initial capacity = 16
load factor = 0.75
resizing = size> capacity*loadfactor
- Arrays of nodes(object).

Node =
1. hash = calculate hash code of key
2. Key = actual key obj
3. Value = Data corresponding to the key
4. Next = Referances/ pointer
 
Bucket index = hash % 16
index = hash & (n-1)
--->Create hashmap: HashMap<keyType, valueType>hm = new HashMap<>();
--->Methods : 
1. hm.put(key , value) It is insertion method. 
1. Best = Time Complexity = O(1)
2. Avegrage = Time Complexity = O(1)
3. Worst = Time Complexity = O(n)(Internal collision)

for all operations

Condition 1 = if key exist - update
Condition 2 = if key not exist - add

1. hm.put(key , value)
2.hmget(key);
3. hm.containsKey(key);
4. hm.remove(key);
5.hm.isEmpty();
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer>hm = new HashMap<>();
		System.out.println("Menu card ");
		hm.put("Dal Roti" , 100);
		hm.put("Samosa" , 20);
		hm.put("Vada Pav" , 15);
		hm.put("Dosa" , 40);
		System.out.println(hm);
	}
}