package piggybank;

public class Nickel extends AbstractDeposit {
  int amount;
  double value;

  public Nickel(int amount) {
    this.amount = amount;
    this.value = 0.05;
  }

  // if no amount arg, make amount 1
  public Nickel() {
    this.amount = 1;
    this.value = 0.05;
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
      return amount + " Nickel";
    } else {
      return amount + " Nickels";
    }
  }
}
