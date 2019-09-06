package piggybank;

public class Dime {
  // each coin should return a string with "1 Dime" or "2 Dimes"

  private int amount;

  public Dime(int amount) {
    this.amount = amount;
    this.value = 0.1;
    // this.desc = "Dime";
  }

  // GETTER
  public int getAmount() {
    return amount;
  }

  // SETTER
  public void setAmount(int amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    if (amount <= 1) {
      return amount + " Dime";
    } else {
      return amount + " Dimes";
    }
  }
}
