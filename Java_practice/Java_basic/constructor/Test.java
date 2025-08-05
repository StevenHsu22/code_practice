package Java_basic.constructor;

public class Test {

    public static void main(String[] args) {
        // Creating an object of Students class using the constructor with parameters
        Students constructor = new Students("John", 25);
        constructor.displayInfo();
        constructor.print();
        constructor.printHobby("reading");
        // Creating an object of Students class using the overloaded constructor
        Students overloadedConstructor = new Students("Jane");
        overloadedConstructor.displayInfo();
        overloadedConstructor.print();

        // System.out.println(constructor.age); // private variable, should not be accessed directly
        constructor.setAge(30); // Using setter method to change age
        System.out.println("Updated Age: " + constructor.getAge()); // Using getter method to

    }

}
