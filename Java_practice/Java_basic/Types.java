package Java_basic;

// 4.
public class Types {

    public static void main(String[] args) {
        byte a = 10; // 1 byte
        print(a); // Implicit conversion to int
        print2(a); // Implicit conversion to double

        System.out.println("========");

        int i = 20; // 4 bytes
        byte j = (byte) i; // Explicit conversion from int to byte
        print3(j);

        double d = 30.5; // 8 bytes
        int k = (int) d; // Explicit conversion from double to int
        System.out.println("Converted Double to Int: " + k);
    }

    public static void print(int b) {
        System.out.println("Integer: " + b);
    }

    public static void print2(double c) {
        System.out.println("Double: " + c);
    }

    public static void print3(byte j) {
        System.out.println("Byte: " + j);
    }

    // Method to demonstrate implicit conversion from byte to int
    public static int calc(byte a, byte b) {
        return a + b; // Implicit conversion from byte to int
    }

    public static double calc(int a, byte b, double c) {
        return a + b + c; // Implicit conversion from byte to double
    }
}
