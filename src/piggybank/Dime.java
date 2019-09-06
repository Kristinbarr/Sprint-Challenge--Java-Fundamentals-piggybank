package piggybank;

public class Dime extends AbstractDeposit {
  // just return a string with "1 Dime" or "2 Dimes"

  int amount;
  double value;
  double depositTotal;

  public Dime(int amount) {
    super(amount);
    this.value = 0.1;
    this.depositTotal = depositTotal;
  }

  // if no amount arg, make amount 1
  public Dime() {
    this.amount = 1;
    this.value = 0.1;
    this.depositTotal = depositTotal;
  }

  @Override
  public double getValue() {
    return value;
  }

  @Override
  public void deposit(int amount) {
    depositTotal = amount * value;
  }

  @Override
  public double getDepositTotal() {
    return depositTotal;
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
