package Java_basic;

public class Lambda {
  
  public static void main(String[] args) {
    // Using a lambda expression to implement the functional interface
    Swim swim = () -> System.out.println("Swimming in the pool");
    swim.swimming(); // Calling the method of the functional interface

    // 2.
    // Student[] students = new Student[3];
    // students[0] = new Student("Alice", 20);
    // students[1] = new Student("Bob", 22);
    // students[2] = new Student("Charlie", 21);

    // Array.sort(students, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
    // equal to
    // Arrays.sort(students, Comparator<Student>() {
    //     @Override
    //     public int compare(Student s1, Student s2) {
    //         return Integer.compare(s1.getAge(), s2.getAge());
    //     }
    // });
    
  }
}

abstract class Animal {
  public abstract void sound();
}

// Using a lambda expression to implement the abstract method
@FunctionalInterface // Defining a functional interface
interface Swim{
  void swimming();
}