package piggybank;

public abstract class AbstractDeposit {
// create the deposit totals

  int amount;
  double depositTotal;

  public AbstractDeposit(int amount) {
    this.amount = amount;
    // this.depositTotal = depositTotal;
  }

  public AbstractDeposit() {
    amount = 1;
  }

  public abstract double getValue();

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public abstract void deposit(int amount);
  // public void deposit(int amount) {
  //   depositTotal = amount * getValue();
  // }

  public abstract double getDepositTotal();
  // public double getDepositTotal() {
  //   return depositTotal;
  // }

}
