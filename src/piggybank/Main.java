package piggybank;

import java.text.DecimalFormat;
import java.util.*;

public class Main {


  public static void printPiggybank(ArrayList<AbstractDeposit> deposits) {
    DecimalFormat fp = new DecimalFormat("$###,###.00");

    double myValue = 0;

    for (AbstractDeposit d : deposits) {

      myValue = myValue + d.getDepositTotal();
    }
    System.out.println("The Piggy Bank holds " + fp.format(myValue));
  }

  public static void main(String[] args) {

    // ______printing out list of coins and their deposit amounts______

    // arraylist will hold [value, amount]?
    ArrayList<AbstractDeposit> piggyBank = new ArrayList<AbstractDeposit>();
    // piggyBank.add(new Quarter());
    piggyBank.add(new Dime(2));
    // piggyBank.add(new Dollar(5));
    // piggyBank.add(new Nickel(3));
    piggyBank.add(new Dime(7));
    // piggyBank.add(new Dollar());
    // piggyBank.add(new Penny(10));

    System.out.println();
    System.out.println("___amounts___");
    piggyBank.forEach((c) -> System.out.println(c.getAmount()));
    System.out.println("___values___");
    piggyBank.forEach((c) -> System.out.println(c.getValue()));
    System.out.println("___depositTotals___");
    piggyBank.forEach((c) -> System.out.println(c.getDepositTotal()));
    System.out.println("___piggybank contents___");
    piggyBank.forEach((c)-> System.out.println(c));


    printPiggybank(piggyBank);

  }

}
