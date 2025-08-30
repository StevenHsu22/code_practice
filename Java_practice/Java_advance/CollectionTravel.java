package Java_advance;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTravel {
    
    public static void main(String[] args) {
        // Example of using a generic class
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add(0, "World");
        
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // read, can't modify set
        for (String word : myList) {
            System.out.println("For-each loop: " + word);
        }

        myList.forEach(action -> {
            System.out.println("Using forEach: " + action);
        });

        myList.forEach(System.out::println);

        // Example of removing an element
        myList.remove(1);
        System.out.println("After removal: " + myList.size());

        // recommended way to iterate and remove elements
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Iterating: " + element);
            if (element.equals("Hello")) {
                iterator.remove(); // Remove "Hello" during iteration 
            }
        }
    }
}
