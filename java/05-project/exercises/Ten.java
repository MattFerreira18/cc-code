/**
 * Etanol (E)
 * === 20l -> 3%
 * > 20l -> 5%
 * preco -> 3.79
 * 
 * Gasolina (G)
 * === 20l -> 5%
 * > 20l -> 6%
 * preco -> 5.35
 */
package exercises;

import java.util.Scanner;

public class Ten {
  String fuelType;
  float ethanolPricePerLiter = 3.79f;
  float gasolinePricePerLiter = 5.35f;
  double finalDebt;
  double liters;

  public static void main(String args[]) {
    Ten ten = new Ten();

    ten.execute();
  }

  public void execute() {
    this.input();
    this.compute();
    this.output();
  }

  private void input() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o tipo de combustível:");
    System.out.println("E - etanol");
    System.out.println("G - gasolina");
    fuelType = input.next();

    System.out.println("Digite o total abastecido, em litros");
    liters = input.nextDouble();

    // input.close();
  }

  private boolean isEthanol(String str) {
    return str.toUpperCase().equals("E");
  }

  private void compute() {
    float discountPercentage = getDiscountPercentage();
    double debtWithoutDiscount = getDebtWithoutDiscount();
    double discount = getDiscount(discountPercentage, debtWithoutDiscount);

    finalDebt = debtWithoutDiscount - discount;
  }

  private float getDiscountPercentage() {
    if (isEthanol(fuelType)) {
      return liters >= 20 ? 0.03f : 0.05f;
    }

    return liters >= 20 ? 0.05f : 0.06f;
  }

  private double getDebtWithoutDiscount() {
    return isEthanol(fuelType)
        ? liters * ethanolPricePerLiter
        : liters * gasolinePricePerLiter;
  }

  private double getDiscount(float percentage, double total) {
    return total * percentage;
  }

  private void output() {
    System.out.println("Total a pagar " + finalDebt);
  }
}
