package piggybank;

import java.text.DecimalFormat;
import java.util.*;

public class Main {

  // public static void printPiggybank(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
  //   for (AbstractAnimal a : animals) {
  //     if (tester.test(a)) {
  //       System.out.println(
          // "The Piggy Bank holds " + fp.format(myValue) +
  //           "Name: " + a.getName() + ", species: " + a.getClass().getSimpleName() + ", named in: " + a.getYear() + ", movement: " + a.move());
  //     }
  //   }
  // }

  public static void main(String[] args) {

    DecimalFormat fp = new DecimalFormat("$###,###.00");

    CreateCollection total = new CreateCollection();

    // HashMap<String, Integer> piggyBank = new HashMap<String, Integer>();
    piggyBank.add(new Quarter());
    piggyBank.add(new Dime());
    piggyBank.add(new Dollar(5));
    piggyBank.add(new Nickel(3));
    piggyBank.add(new Dime(7));
    piggyBank.add(new Dollar());
    piggyBank.add(new Penny(10));


  }

}
