package Java_basic;

// This class is usually defined in a separate file.
class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

public class ObjectOriented {

    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("Alice", 30);
        // Call the method to print a greeting

        person.sayHello();

        // Demonstrate method overloading
        System.out.println("Sum of two integers: " + calc(5, 10));
        System.out.println("Sum of an integer, byte, and double: " + calc(5, (byte) 10, 15.5));
    }

    public static int calc(int a, int b) {
        return a + b;
    }

    public static double calc(int a, byte b, double c) {
        return a + b + c;
    }
}
