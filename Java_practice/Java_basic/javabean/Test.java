package Java_basic.javabean;

public class Test {

    public static void main(String[] args) {
        // Creating an object of Students class using the no-argument constructor
        Students student = new Students();
        student.setName("Alice");
        student.setChineseScore(85);
        student.setMathScore(90);

        // Displaying student information
        System.out.println("Name: " + student.getName());
        System.out.println("Chinese Score: " + student.getChineseScore());
        System.out.println("Math Score: " + student.getMathScore());

        // Using StudentsOperator to print total score
        StudentsOperator operator = new StudentsOperator();
        operator.printTotalScore(student);
    }
}
