package Java_basic;

public class Operator {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a)); // int / int results in int
        System.out.println("Modulus: " + (b % a));

        System.out.println(a + 'a' + "Modulus"); // 10 + 97 + "Modulus" = 107Modulus

        // ++ and --
        a++; // Increment a by 1
        System.out.println("Incremented a: " + a);
        b--; // Decrement b by 1
        System.out.println("Decremented b: " + b);
        int c = a++; // Post-increment: c gets the value of a before incrementing
        System.out.println("Post-incremented c: " + c); // c is 11, a is now 12
        System.out.println("a: " + a);
        int d = ++a; // Pre-increment: a is incremented first, then assigned
        System.out.println("Pre-incremented d: " + d); // d is 13, a is now 13
        System.out.println("a: " + a);

        // Relational Operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("1. x AND y: " + (x & y)); // x and y true if both are true else false
        System.out.println("1. x OR y: " + (x | y)); // x or y true if either is true else false
        System.out.println("2. x AND y: " + (x && y)); // if left is false, right is not evaluated
        System.out.println("2. x OR y: " + (x || y)); // if left is true, right is not evaluated
        int r = 10;
        int s = 20;
        System.out.println(r > 100 && ++s > 20); // false, s is not incremented
        System.out.println("s after AND operation: " + s); // s remains 20

        System.out.println("NOT x: " + (!x));
        System.out.println("^: " + (2 > 1 ^ 3 > 1));
        System.out.println("^: " + (2 > 1 ^ 3 < 1));

        int max = (a > b) ? a : b; // Ternary operator -> (condition) ? value_if_true : value_if_false;
        System.out.println("Max of a and b: " + max); //  If a is greater than b, max is a, else max is b
        /*
      * if (a > b) {
        max = a;
      } else {
        max = b;
      }
         */
        int max2 = a > b ? (a > c ? a : c) : (b > c ? b : c);
    }
}
