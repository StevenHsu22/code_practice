package Java_basic.enumdemo;

public class Test {

    public static void main(String[] args) {
        A[] values = A.values();

        for (A value : values) {
            value.display();
            System.out.println("Ordinal: " + value.ordinal());
            System.out.println("Name: " + value.name());
        }
    }
}
