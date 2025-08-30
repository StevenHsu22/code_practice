package Java_advance.ThreadApiDemo;

public class ThreadDemo1 {
  
  public static void main(String[] args) {

    Account account = new Account("123456789", 1000.0);

    new DrawThread("Thread-1", account).start();
    new DrawThread("Thread-2", account).start();
  }
}
