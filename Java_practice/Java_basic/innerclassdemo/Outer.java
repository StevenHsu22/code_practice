package Java_basic.innerclassdemo;

public class Outer {

    public static String outerField = "Outer field";

    public void outerMethod() {
        System.out.println("Outer method called");
    }

    private int age = 30;

    public class Inner {

        private String innerField = "Inner field";

        public Inner() {
            System.out.println("Inner class constructor called");
        }

        public void display() {
            System.out.println("Inner class method called");
        }
    }
}
