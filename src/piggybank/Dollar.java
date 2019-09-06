package piggybank;

public class Dollar extends AbstractDeposit {
  int amount;
  double value;

  public Dollar(int amount) {
    this.amount = amount;
    this.value = 1.00;
  }

  // if no amount arg, make amount 1
  public Dollar() {
    this.amount = 1;
    this.value = 1.00;
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
    return "$" + amount;
  }
}
