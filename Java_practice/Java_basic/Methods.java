package Java_basic;
// Run in Java_basic/: javac Methods.java && java Methods.java

// 3.
public class Methods {

    public static void main(String[] args) {
        greet("Alice");
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);

        printNumbers(1, 5);

        String reversed = reverseString("Java");
        System.out.println("Reversed String: " + reversed);
    }

    // Method to greet a user
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to print numbers from start to end
    // no return type, void
    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method overloaded to greet based on age
    public static void greet(int age) {
        if (age < 18) {
            System.out.println("Hello, young one!");
        } else {
            System.out.println("Hello, adult!");
        }
    }
}
