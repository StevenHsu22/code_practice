package Java_basic;
// Run in Java_basic/: javac HelloWorld.java && java HelloWorld.java

// 1.
public class HelloWorld {

    /**
     * Main method to run the HelloWorld program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // bash -> java HelloWorld hello world
        /*
         * System.out.println(args[0]); // print "hello"
         * System.out.println(args[1]); // print "world"
         */
        printHello();
        greet("Alice");
    }

    // print 3 lines of hello
    public static void printHello() {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
