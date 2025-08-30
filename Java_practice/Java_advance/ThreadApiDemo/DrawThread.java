package Java_advance.ThreadApiDemo;

public class DrawThread extends Thread {

  private final Account account;

  public DrawThread(String name, Account account) {
      super(name);
      this.account = account;
  }

  @Override
  public void run() {
      // Simulate a withdrawal
      account.drawMoney(800);
  }
}
