package piggybank;

public class Penny extends AbstractDeposit {
  int amount;
  double value;

  public Penny(int amount) {
    this.amount = amount;
    this.value = 0.01;
  }

  // if no amount arg, make amount 1
  public Penny() {
    this.amount = 1;
    this.value = 0.01;
  }

  @Override
  public double getValue() {
    return value;
  }

  @Override
  public double getDepositTotal() {
    return amount * value;
  }

  @Override
  public String toString() {
    if (amount == 1) {
      return amount + " Penny";
    } else {
      return amount + " Pennies";
    }
  }
}
