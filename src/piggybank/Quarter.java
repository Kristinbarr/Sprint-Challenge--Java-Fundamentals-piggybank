package piggybank;

public class Quarter extends AbstractDeposit {
  int amount;
  double value;

  public Quarter(int amount) {
    this.amount = amount;
    this.value = 0.25;
  }

  // if no amount arg, make amount 1
  public Quarter() {
    this.amount = 1;
    this.value = 0.25;
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
      return amount + " Quarter";
    } else {
      return amount + " Quarters";
    }
  }
}
