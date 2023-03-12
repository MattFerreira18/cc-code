// Multiply Table

import java.util.Scanner;

public class First {
  private int minFactor = 0;
  private int maxFactor;
  private int multiplier;

  public static void main(String args[]) {
    First table = new First();

    table.input();
    table.output();
  }

  private void input() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número: ");
    multiplier = input.nextInt();

    System.out.println("Digite a quantidade máxima da tabuada: ");
    maxFactor = input.nextInt();

    input.close();
  }

  private void output() {
    for (int i = minFactor; i <= maxFactor; i++) {
        int result = multiplier * i;

      System.out.printf(multiplier + " x " + i + " = " + result + "\n");
    }
  }
}
