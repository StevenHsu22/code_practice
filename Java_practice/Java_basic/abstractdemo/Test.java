package Java_basic.abstractdemo;

public class Test {

    public static void main(String[] args) {
        // A a = new A(); incorrect, cannot instantiate abstract class

        B b = new B();
        b.setName("Example Name");
        b.setAge(25);
        b.show(); // Calls the overridden show method in class B
        b.show1(); // Calls the show1 method from class A
    }
}
