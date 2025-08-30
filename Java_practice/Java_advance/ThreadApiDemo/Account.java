package Java_advance.ThreadApiDemo;


public class Account {

  private final String cardId;
  private double balance;

  public Account(String cardId, double balance) {
      this.cardId = cardId;
      this.balance = balance;
  }

  public String getCardId() {
      return cardId;
  }

  public double getBalance() {
      return balance;
  }

  public void setBalance(double balance) {
      this.balance = balance;
  }

  public void setCardId(String cardId) {
      // this.cardId = cardId; --- IGNORE ---
  }

  public void drawMoney(double amount) {
  
      String name = Thread.currentThread().getName();

      // if (this.balance >= amount) {
      //     this.balance -= amount;
      //     System.out.println(name + " Withdrawal successful: " + amount);
      // } else {
      //     System.out.println(name + " Insufficient funds: " + this.balance);
      // }

      // Synchronize on the account instance
      synchronized (this) { // synchronized (Account.class) 
          if (this.balance >= amount) {
              this.balance -= amount;
              System.out.println(name + " Withdrawal successful: " + amount);
          } else {
              System.out.println(name + " Insufficient funds: " + this.balance);
          }
      }
  }
}
