package Account;

public class Account {

  private String id;
  private String name;
  private double balance = 0.0;

  public Account(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public Account(String id, String name, Double balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public void getId() {
    System.out.println("Id: " + this.id);
  }

  public void getName() {
    System.out.println("Name: " + this.name);
  }

  public void getBalance() {
    System.out.println("Balance: " + this.balance);
  }

  public void credit(double amnt) {
    this.balance += amnt;
    System.out.println("Balance: " + this.balance);
  }

  public void debit(double amnt) {
    if (amnt >= this.balance) {
      System.out.println("Amount exceeds balance in account");
    } else {
      this.balance -= amnt;
    }
    System.out.println("Balance: " + this.balance);
  }

  public void transferTo(Account accnt, double amnt) {
    if (amnt >= this.balance) {
      System.out.println("Amount exceeds balance in account");
    } else {
      this.balance -= amnt;
      accnt.balance += amnt;
      System.out.println("Transfer was succesful");
    }
    System.out.println("Balance after transfer: " + this.balance);
  }

  public String toString() {
    String tmp =
      "Account id: " +
      this.id +
      "\n" +
      "Account Name: " +
      this.name +
      "\n" +
      "Balance: " +
      this.balance +
      "\n";
    return tmp;
  }
}
