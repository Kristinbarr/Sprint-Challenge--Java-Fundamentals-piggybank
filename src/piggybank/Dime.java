package piggybank;

public class Dime extends AbstractDeposit {
  int amount;
  double value;

  public Dime(int amount) {
    this.amount = amount;
    this.value = 0.10;
  }

  // if no amount arg, make amount 1
  public Dime() {
    this.amount = 1;
    this.value = 0.10;
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
      return amount + " Dime";
    } else {
      return amount + " Dimes";
    }
  }
}
