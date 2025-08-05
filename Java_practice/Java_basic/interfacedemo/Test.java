package Java_basic.interfacedemo;

public class Test {

    public static void main(String[] args) {
        C c = new C();
        c.method1(); // Calls method1 from interface A
        c.method2(); // Calls method2 from interface A
        c.defaultMethod(); // Calls the default method from interface A
        c.play(); // Calls the play method from interface B
        System.out.println(A.NAME); // Accesses the static variable from interface A
    }

}

// C have to implement methods from both interfaces A and B
class C implements B, A {

    @Override
    public void method1() {
        System.out.println("Method1 implementation in class C");
    }

    @Override
    public String method2() {
        return "Method2 implementation in class C";
    }

    @Override
    public void play() {
        System.out.println("Play method implementation in class C");
    }
}
