package Java_basic;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        // First 'Scanner' is the type, 'sc' is the variable name, and 'new Scanner(...)' creates the object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt(); // stops reading input when a non-integer is entered
        System.out.println("You entered: " + number);

        System.out.print("Enter a double: ");
        double decimal = sc.nextDouble();
        System.out.println("You entered: " + decimal);

        System.out.print("Enter a character: ");
        char letter = sc.next().charAt(0);
        System.out.println("You entered: " + letter);

        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.println("You entered: " + text);

        sc.close();
    }
}
