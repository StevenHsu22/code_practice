package Java_basic.constructor;

public class Students {

    private final String name; // Final variable to ensure name is immutable
    private int age;

    // Constructor with parameters
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overloaded constructor with only name
    public Students(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of Students class
        Students student1 = new Students("Alice", 20);
        student1.displayInfo();

        Students student2 = new Students("Bob");
        student2.displayInfo();
    }

    public void print() {
        System.out.println(this);
        System.out.println(this.name);
    }

    public void printHobby(String name) {
        System.out.println(this.name + " likes " + name);
    }

    public void setAge(int age) {
        if (age >= 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public int getAge() {
        return age;
    }
}
