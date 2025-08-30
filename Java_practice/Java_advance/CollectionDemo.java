package Java_advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


// the difference between ArrayList and LinkedList
// ArrayList: dynamic array, fast access, slow insert/delete
// LinkedList: doubly linked list, slow access, fast insert/delete

public class CollectionDemo {

  public static void main(String[] args) {
    // Example of using a generic class
    ArrayList<String> list = new ArrayList<>(); // ArrayList, LinkedList, Vector
    list.add("Java");
    list.add("Java");
    list.add("C");
    list.add("C++");
    System.out.println(list);
    System.out.println(list.get(0));

    
    Set<String> set = new HashSet<>(); // HashSet, LinkedHashSet, TreeSet
    set.add("Java");
    set.add("Java"); // Duplicate, will not be added
    set.add("C");
    set.add("C++");
    System.out.println(set);
    System.out.println(set.contains("Java"));

    // Collection
    Collection<String> collection = new ArrayList<>();
    collection.add("Python");
    collection.add("JavaScript");
    System.out.println(collection); 
    System.out.println(collection.size());
    collection.remove("Python");
    collection.contains("JavaScript");
    collection.clear();
    System.out.println("After clearing: " + collection.size());
    collection.isEmpty();

    Object[] array = collection.toArray();
    System.out.println("Array from collection: " + Arrays.toString(array));

    // new mean create a new array with the same type as the collection
    String [] array2 = collection.toArray(String[] ::new);
    System.out.println("Array from collection with type: " + Arrays.toString(array2));
  }
}
