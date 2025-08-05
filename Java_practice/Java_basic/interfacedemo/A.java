package Java_basic.interfacedemo;

public interface A {

    String NAME = "Interface A"; // public static final by default
  
    void method1();
    
    String method2();
    
    default void defaultMethod() {
        System.out.println("Default method in interface A");
    }
    
    static String staticMethod() {
        return "Static method in interface A";
    }
}
