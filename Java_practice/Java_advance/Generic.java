package Java_advance;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        // Example of using a generic class
        ArrayList<String> stringGeneric = new ArrayList<>();
        stringGeneric.add("World");
        
        System.out.println(stringGeneric.get(0));

        ArrayList<Integer> integerGeneric = new ArrayList<>();
        integerGeneric.add(456);
        System.out.println(integerGeneric.get(0));

        // Example of using MyArrayList
        MyArrayList<String> myStringList = new MyArrayList<>();
        myStringList.add("Hello");
        System.out.println(myStringList.get(0));
    }
  
}
