package Account;

public class testAccount {

  public static void main(String[] args) {
    Account acc2 = new Account("444", "acc1", 5000.00);
    Account acc1 = new Account("235", "acc2", 4000.00);

    acc1.getId();
    acc1.getBalance();
    // System.out.println("");
    acc2.getId();
    acc2.getBalance();
    System.out.println("");
    acc1.transferTo(acc1, 1000.00);
    System.out.println("");
    acc1.getId();
    acc1.getBalance();
    // System.out.println("");
    acc2.getId();
    acc2.getBalance();
  }
}
