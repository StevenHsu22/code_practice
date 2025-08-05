package Java_basic;
// Run in Java_basic/: javac Variables.java && java Variables.java

// 2.
public class Variables {

    public static void main(String[] args) {

        printVariables();
    }

    public static void printVariables() {
        int number = 10;
        double decimal = 5.5;
        char letter = 'A';
        String text = "Hello, Java!";

        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);
        System.out.println("Character: " + letter);
        System.out.println("String: " + text);

        number = 20; // Reassigning variable
        System.out.println("Reassigned Integer: " + number);
        number += 5; // Incrementing variable
        System.out.println("Incremented Integer: " + number);

        System.out.println(letter + 1); // Implicit conversion to int

        int i1 = 0B01100001; // Binary literal (0 ~ 1)
        System.out.println("Binary Literal: " + i1);
        int i2 = 0141; // Octal literal (0 ~ 7)
        System.out.println("Octal Literal: " + i2);
        int i3 = 0xfa; // Hexadecimal literal  (0 ~ 9, a ~ f)
        System.out.println("Hexadecimal Literal: " + i3);
    }
}
