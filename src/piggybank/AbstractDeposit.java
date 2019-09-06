package piggybank;

public abstract class AbstractDeposit {

  int amount;
  double depositTotal;

  public AbstractDeposit(int amount) {
    this.amount = amount;
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

  public abstract double getDepositTotal();

}
